package com.smartcrm.backend.controller;

import com.smartcrm.backend.model.CustomerEntity;
import com.smartcrm.backend.repository.CustomerRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/customers")
public class HelloController {

    private final CustomerRepository repository;

    public HelloController(CustomerRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public CustomerEntity createCustomer(
            @RequestBody CustomerEntity customer) {
        return repository.save(customer);
    }

    @GetMapping
    public java.util.List<CustomerEntity> getAllCustomers() {
        return repository.findAll();
    }
}
