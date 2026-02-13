package com.sneha.demo.learningSpringBootApp;

import jakarta.persistence.*;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    private Integer id;

    private String type;

    private Double amount;

    public Payment() {}

    public Payment(Integer id, String type, Double amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }
}
