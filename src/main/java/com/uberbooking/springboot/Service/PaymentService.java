package com.uberbooking.springboot.Service;

import com.uberbooking.springboot.Entity.Customer;
import com.uberbooking.springboot.Entity.Payment;
import com.uberbooking.springboot.Repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;


    public Payment createSession(String paymentMod)
    {
        Payment session = new Payment();
        session.setPaymentMod(paymentMod);
        return repository.save(session);
    }
}
