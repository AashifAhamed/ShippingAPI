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
	@GeneratedValue(strategy=GenerationType.AUTO)
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
	private String Status;
	
	@NotBlank
	private String type;
	
	@Temporal(TemporalType.TIMESTAMP)
//	@LastModifiedDate
	private Date estDelivery;

	
	public long getShippingId() {
		return id;
	}

	public void setShippingId(long shippingId) {
		id = shippingId;
	}

	public long getSellerId() {
		return sellerId;
	}

	public void setSellerId(long sellerId) {
		this.sellerId = sellerId;
	}

	public long getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(long buyerId) {
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
