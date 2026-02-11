package com.smartcrm.backend.controller;

import com.smartcrm.backend.model.CustomerEntity;
import com.smartcrm.backend.service.CustomerService;
import jakarta.validation.Valid;


import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class HelloController {

    private final CustomerService service;

    public HelloController(CustomerService service) {
        this.service = service;
    }

   @PostMapping
public CustomerEntity createCustomer(
        @Valid @RequestBody CustomerEntity customer) {
    return service.saveCustomer(customer);
}


    @GetMapping
    public List<CustomerEntity> getAllCustomers() {
        return service.getAllCustomers();
    }
}
