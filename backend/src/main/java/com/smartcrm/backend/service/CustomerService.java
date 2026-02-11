package com.smartcrm.backend.service;

import com.smartcrm.backend.model.CustomerEntity;
import com.smartcrm.backend.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public CustomerEntity saveCustomer(CustomerEntity customer) {
        return repository.save(customer);
    }

    public List<CustomerEntity> getAllCustomers() {
        return repository.findAll();
    }
}
