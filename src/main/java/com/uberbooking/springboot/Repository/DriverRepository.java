package com.uberbooking.springboot.Repository;

import com.uberbooking.springboot.Entity.Driver;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver,Integer> {

    Driver findByDriverName(String driverName);
}
