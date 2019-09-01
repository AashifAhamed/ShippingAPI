package com.paf.shippingapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paf.shippingapi.dao.ShippingDAO;
import com.paf.shippingapi.model.Shipping;

@RestController
@RequestMapping("/sales")
public class ShippingController {

	@Autowired
	ShippingDAO shippingDAO;
	
//	save Shipping
	@PostMapping("/shippings")
	public Shipping createShipping(@Valid @RequestBody Shipping shp) {
		return shippingDAO.save(shp);
	}
	
//	get all shipping 
	@GetMapping("/shippings")
	public List<Shipping> getAllShippings(){
		return shippingDAO.findAll();
	}
	
//	get a shipping detail by id 
	@GetMapping("/shippings/{id}")
	public ResponseEntity<Shipping> getEmployeeById(@PathVariable(value="id") Long shpid){
		
		Shipping shp=shippingDAO.findById(shpid);
		
		if(shp==null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(shp);
		
	}
	
//	update a shipping
	@PutMapping("/shippings/{id}")
	public ResponseEntity<Shipping> updateEmployee(@PathVariable(value="id") Long shpid,@Valid @RequestBody Shipping shpDetails){
		
		Shipping shp=shippingDAO.findById(shpid);
		if(shp==null) {
			return ResponseEntity.notFound().build();
		}
		
		shp.setSellerId(shpDetails.getSellerId());
		shp.setBuyerId(shpDetails.getBuyerId());
		shp.setStatus(shpDetails.getStatus());
		shp.setType(shpDetails.getType());
		shp.setEstDelivery(shpDetails.getEstDelivery());
		
		Shipping updateshipping=shippingDAO.save(shp);
		return ResponseEntity.ok().body(updateshipping);
		
	}
	
//	 delete a shipping
	@DeleteMapping("/shippings/{id}")
	public ResponseEntity<Shipping> deleteEmployee(@PathVariable(value="id") Long shpid){
		
		Shipping shp=shippingDAO.findById(shpid);
		if(shp==null) {
			return ResponseEntity.notFound().build();
		}
		shippingDAO.delete(shp);
		
		return ResponseEntity.ok().build();
		
		
	}
	
	
	
}
