package com.sneha.demo.learningSpringBootApp;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {

    private final List<Payment> payments = new ArrayList<>();

    // CREATE (POST)
    public Payment addPayment(Payment payment) {
        payments.add(payment);
        return payment;
    }

    // READ ALL (GET)
    public List<Payment> getAllPayments() {
        return payments;
    }

    // READ ONE (GET)
    public Payment getPaymentById(int id) {
        return payments.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    // UPDATE (PUT)
    public Payment updatePayment(Integer id, Payment updatedPayment) {
        Payment existing = getPaymentById(id);
        if (existing != null) {
            existing.setType(updatedPayment.getType());
            existing.setAmount(updatedPayment.getAmount());
        }
        return existing;
    }

    // DELETE (DELETE)
    public boolean deletePayment(int id) {
        return payments.removeIf(p -> p.getId() == id);
    }
}
