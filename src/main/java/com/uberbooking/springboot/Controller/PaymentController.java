package com.uberbooking.springboot.Controller;


import com.uberbooking.springboot.Entity.Payment;
import com.uberbooking.springboot.Service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("payment")
public class PaymentController {

    @Autowired
    private PaymentService service;


    @RequestMapping("/session")
    public Payment createSession(@RequestParam(required = false, name="paymentMod") String paymentMod) {
        if (paymentMod == null) {
            paymentMod = "None";
        }
        return service.createSession(paymentMod);
    }

}
