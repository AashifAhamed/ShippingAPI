package com.paf.shippingapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name="Shippings")
@EntityListeners(AuditingEntityListener.class)
public class Shipping {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Column(name="sellerId")
	private long sellerId;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@NotNull
	@Column(name="buyerId")
	private long buyerId;
	
	@NotBlank
	@Column(name="Status")
	private String Status;
	
	@NotBlank
	@Column(name="type")
	private String type;
	
	@Temporal(TemporalType.TIMESTAMP)
//	@LastModifiedDate
	@Column(name="estDelivery")
	private Date estDelivery;

	
	public Long getShippingId() {
		return id;
	}

	public void setShippingId(Long shippingId) {
		id = shippingId;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public Long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(Long buyerId) {
		this.buyerId = buyerId;
	}

	public String getStatus() {
		return Status;
	}

	public void setStatus(String status) {
		Status = status;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getEstDelivery() {
		return estDelivery;
	}

	public void setEstDelivery(Date estDelivery) {
		this.estDelivery = estDelivery;
	}

	
}
