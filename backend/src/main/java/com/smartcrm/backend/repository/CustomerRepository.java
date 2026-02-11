package com.smartcrm.backend.repository;

import com.smartcrm.backend.model.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository
        extends JpaRepository<CustomerEntity, Long> {
}
