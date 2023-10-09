package com.uberbooking.springboot.Repository;
import com.uberbooking.springboot.Entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarRepository extends JpaRepository<Car, Integer> {
    Car findByCarPlateNumber(String carPlateNumber);



}
