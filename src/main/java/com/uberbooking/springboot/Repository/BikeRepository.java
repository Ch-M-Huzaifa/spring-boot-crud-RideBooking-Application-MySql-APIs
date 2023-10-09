package com.uberbooking.springboot.Repository;

import com.uberbooking.springboot.Entity.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BikeRepository extends JpaRepository<Bike,Integer> {

    Bike findByBikePlateNumber(String bikePlateNumber);

}
