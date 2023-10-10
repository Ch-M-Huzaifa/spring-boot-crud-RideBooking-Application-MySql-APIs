package com.uberbooking.springboot.Controller;

import com.uberbooking.springboot.Entity.Customer;
import com.uberbooking.springboot.Entity.Ride;
import com.uberbooking.springboot.Service.CustomerService;
import com.uberbooking.springboot.Service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ride")
public class RideController {

    @Autowired
    private RideService service;

    @PostMapping("/bookRide")
    public Ride bookride(@RequestBody Ride ride)
    {
        return service.saveRide(ride);
    }

    @GetMapping("/rides")
    public List<Ride> GetAllRides()
    {
        return service.getRides();
    }

    @GetMapping("/rideById/{id}")
    public Ride findRideById(@PathVariable int id) {
        return service.getRideById(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteRide(@PathVariable int id)
    {
        return service.deleteRide(id);
    }
}
