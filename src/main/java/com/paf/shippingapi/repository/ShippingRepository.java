package com.paf.shippingapi.repository;

import com.paf.shippingapi.model.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {

}
