package com.example.paymentservice.services;

import org.springframework.stereotype.Service;
import com.example.paymentservice.paymentgateways.PaymentGateway;

@Service
public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(String email, String phoneNumber, Long amount, String orderId) {
    /*
    * 1. Call Order Service
    * 2. Get Order details
    * 3. Verify Amount
    * 4. Call Payment Gateway to generate payment link
    * 5. Return paymentlink
    * */
        return paymentGateway.generatePaymentLink(email, phoneNumber, amount,orderId);
    }
}
