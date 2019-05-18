package com.paf.shippingapi.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.paf.shippingapi.model.Shipping;
import com.paf.shippingapi.repository.ShippingRepository;

@Service
@Repository
@Transactional
public class ShippingDAO {
	
	@Autowired
	ShippingRepository shippingRepository;

	
//	to save a shipping detail
	
	public Shipping save(Shipping s) {
		return shippingRepository.save(s);
	}
	
//	get all shipping
	
	public List<Shipping> findAll(){
		return shippingRepository.findAll();
	}
	
//	get a shipping 
	
	public Shipping findOne(Long shpId) {
		return shippingRepository.findOne(shpId);
	}
	
//	delete a shipping
	
	public void delete(Shipping shpId) {
		shippingRepository.delete(shpId);
	}
}
