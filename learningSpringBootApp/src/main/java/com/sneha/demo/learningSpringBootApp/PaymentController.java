package com.sneha.demo.learningSpringBootApp;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    // POST - Create payment
    @PostMapping
    public Payment createPayment(@RequestBody Payment payment) {
        return paymentService.addPayment(payment);
    }

    // GET - Get all payments
    @GetMapping
    public List<Payment> getAllPayments() {
        return paymentService.getAllPayments();
    }

    // GET - Get payment by id
    @GetMapping("/{id}")
    public Payment getPayment(@PathVariable Integer id) {
        return paymentService.getPaymentById(id);
    }

    // PUT - Update payment
    @PutMapping(value = "/{id}", consumes = "application/json")
    public Payment updatePayment(
            @PathVariable("id") Integer id,
            @RequestBody Payment payment) {

        return paymentService.updatePayment(id, payment);
    }

    // DELETE - Delete payment
    @DeleteMapping("/{id}")
    public String deletePayment(@PathVariable Integer id) {
        boolean removed = paymentService.deletePayment(id);
        return removed ? "Payment deleted" : "Payment not found";
    }
}



