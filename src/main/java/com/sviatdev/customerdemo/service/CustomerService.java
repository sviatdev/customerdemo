package com.sviatdev.customerdemo.service;

import com.sviatdev.customerdemo.model.Customer;

import java.util.List;

public interface CustomerService {
    Customer getById(Long id);
    void save(Customer customer);
    void delete(Long id);
    List<Customer> getAll();
}
