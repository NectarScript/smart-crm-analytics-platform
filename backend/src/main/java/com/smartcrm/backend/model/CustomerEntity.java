package com.smartcrm.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class CustomerEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Double purchaseAmount;

    // Constructors
    public CustomerEntity() {}

    public CustomerEntity(String name, String email, Double purchaseAmount) {
        this.name = name;
        this.email = email;
        this.purchaseAmount = purchaseAmount;
    }

    // Getters and Setters
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Double getPurchaseAmount() { return purchaseAmount; }
    public void setPurchaseAmount(Double purchaseAmount) {
        this.purchaseAmount = purchaseAmount;
    }
}
