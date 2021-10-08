package com.sviatdev.customerdemo.service;

import com.sviatdev.customerdemo.model.Customer;
import com.sviatdev.customerdemo.repository.CustomerRep;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRep customerRep;

    @Override
    public Customer getById(Long id) {
        log.info("IN CustomerServiceImpl method getById", id);
        return customerRep.findOne(id);
    }

    @Override
    public void save(Customer customer) {
        log.info("IN CustomerServiceImpl method save", customer);
        customerRep.save(customer);
    }

    @Override
    public void delete(Long id) {
        log.info("IN CustomerServiceImpl method delete", id);
        customerRep.delete(id);
    }

    @Override
    public List<Customer> getAll() {
        log.info("IN CustomerServiceImpl method getAll");
        return customerRep.findAll();
    }
}
