package com.uberbooking.springboot.Controller;

import com.uberbooking.springboot.Entity.Bike;
import com.uberbooking.springboot.Service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bike")
public class BikeController {
    @Autowired
    private BikeService service;

    @PostMapping("/registerBike")
    public Bike registerBike(@RequestBody Bike bike)
    {
        return service.saveBike(bike);
    }

    @PostMapping("/registerBikes")
    public List<Bike> registerBikes(@RequestBody List<Bike> bikes)
    {
        return service.saveBikes(bikes);
    }

    @GetMapping("/bikes")
    public List<Bike> findAllBikes()
    {
        return service.getBikes();
    }

    @GetMapping("/bikeById/{id}")
    public Bike findBikeById(@PathVariable int id) {
        return service.getBikeById(id);
    }

    @GetMapping("/bike/{bikePlateNumber}")
    public Bike findByBikePlateNumber(@PathVariable String bikePlateNumber)
    {
        return service.getBikePlateNumber(bikePlateNumber);
    }

    @PutMapping("/update")
    public Bike updateBike(@RequestBody Bike bike)
    {
        return service.updateBike(bike);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBike(@PathVariable int id)
    {
        return service.deleteBike(id);
    }
}
