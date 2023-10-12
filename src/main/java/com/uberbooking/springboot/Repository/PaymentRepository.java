package com.uberbooking.springboot.Repository;

import com.uberbooking.springboot.Entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment,Integer> {

}
