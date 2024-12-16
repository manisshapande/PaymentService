package com.example.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

public class InitiatePaymentDto {
    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    private String phoneNumber;

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOrderId() {
        return orderId;
    }

    public Long getAmount() {
        return amount;
    }

    private String orderId;
    private Long amount;
}
