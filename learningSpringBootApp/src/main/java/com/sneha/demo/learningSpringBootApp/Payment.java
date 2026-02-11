package com.sneha.demo.learningSpringBootApp;

public class Payment {

    private Integer id;
    private String type;
    private Double amount;

    public Payment() {
    }

    public Payment(Integer id, String type, Double amount) {
        this.id = id;
        this.type = type;
        this.amount = amount;
    }

    public Integer getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}

