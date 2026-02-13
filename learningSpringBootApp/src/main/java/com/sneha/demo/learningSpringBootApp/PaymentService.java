package com.sneha.demo.learningSpringBootApp;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public Payment addPayment(Payment payment) {
        return paymentRepository.save(payment);
    }

    public List<Payment> getAllPayments() {
        return paymentRepository.findAll();
    }

    public Payment getPaymentById(Integer id) {
        return paymentRepository.findById(id).orElse(null);
    }

    public Payment updatePayment(Integer id, Payment updatedPayment) {
        Payment existing = paymentRepository.findById(id).orElse(null);

        if (existing != null) {
            existing.setType(updatedPayment.getType());
            existing.setAmount(updatedPayment.getAmount());
            return paymentRepository.save(existing);
        }
        return null;
    }

    public boolean deletePayment(Integer id) {
        if (paymentRepository.existsById(id)) {
            paymentRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
