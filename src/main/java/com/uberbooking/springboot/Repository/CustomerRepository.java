package com.uberbooking.springboot.Repository;

import com.uberbooking.springboot.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    Customer findByName(String name);

}
