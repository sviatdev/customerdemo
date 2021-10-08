package com.sviatdev.customerdemo.repository;

import com.sviatdev.customerdemo.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
*Repository interface for {@link Customer} class
 */
public interface CustomerRep extends JpaRepository<Customer, Long> {

}
