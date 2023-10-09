package com.uberbooking.springboot.Service;


import com.uberbooking.springboot.Entity.Driver;
import com.uberbooking.springboot.Repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverService {
    @Autowired
    private DriverRepository repository;

    public Driver saveDriver(Driver driver) {

        return repository.save(driver);
    }

    public List<Driver> saveDrivers(List<Driver> drivers) {
        return repository.saveAll(drivers);
    }

    public List<Driver> getDrivers() {
        return repository.findAll();
    }

    public Driver getDriverById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Driver getDriverByName(String driverName) {
        return repository.findByDriverName(driverName);
    }

    public String deleteDriver(int id) {
        repository.deleteById(id);
        return "Driver removed !! " + id;
    }

    public Driver updateDriver(Driver driver) {
        Driver existingDriver = repository.findById(driver.getId()).orElse(null);
        if (existingDriver != null) {
            existingDriver.setDriverName(driver.getDriverName());
            existingDriver.setLicenseType(driver.getLicenseType());
            existingDriver.setPhone(driver.getPhone());
            existingDriver.setAvailable(driver.isAvailable());
            return repository.save(existingDriver);
        }
        return null; // Return null if the driver with the given ID doesn't exist.
    }
}

