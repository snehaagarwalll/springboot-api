package com.sneha.demo.learningSpringBootApp;

import org.springframework.stereotype.Component;

@Component
public class StripePaymentService {
    public String pay() {
        String payment = "Stripe Payment";
        System.out.println("Payment from: " + payment);
        return payment;
    }
}
