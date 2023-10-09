package com.uberbooking.springboot.Controller;


import com.uberbooking.springboot.Entity.Driver;
import com.uberbooking.springboot.Service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("driver")
public class DriverController {
    @Autowired
    private DriverService service;

    @PostMapping("/registerDriver")
    public Driver registerDriver(@RequestBody Driver driver)

    {
        return service.saveDriver(driver);
    }

    @PostMapping("/registerDrivers")
    public List<Driver> registerDrivers(@RequestBody List<Driver> drivers)
    {
        return service.saveDrivers(drivers);
    }

    @GetMapping("/drivers")
    public List<Driver> findAllDrivers()

    {
        return service.getDrivers();
    }

    @GetMapping("/driverById/{id}")
    public Driver findDriverById(@PathVariable int id) {
        return service.getDriverById(id);
    }

    @GetMapping("/driver/{driverName}")
    public Driver findDriverByName(@PathVariable String driverName)

    {
        return service.getDriverByName(driverName);
    }

    @PutMapping("driver/update")
    public Driver updateDriver(@RequestBody Driver driver)
    {
        return service.updateDriver(driver);
    }

    @DeleteMapping("driver/delete/{id}")
    public String deleteDriver(@PathVariable int id)
    {
        return service.deleteDriver(id);
    }

}