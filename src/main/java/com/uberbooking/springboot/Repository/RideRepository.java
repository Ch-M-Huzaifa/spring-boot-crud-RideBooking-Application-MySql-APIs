package com.uberbooking.springboot.Repository;

import com.uberbooking.springboot.Entity.Customer;
import com.uberbooking.springboot.Entity.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride,Integer> {
}
