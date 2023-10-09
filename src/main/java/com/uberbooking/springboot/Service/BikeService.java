package com.uberbooking.springboot.Service;

import com.uberbooking.springboot.Entity.Bike;
import com.uberbooking.springboot.Entity.Customer;
import com.uberbooking.springboot.Repository.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikeService {
    @Autowired
    private BikeRepository repository;

    public Bike saveBike(Bike bike){
        return repository.save(bike);
    }
    public List<Bike> saveBikes(List<Bike>bikes)

    {
        return repository.saveAll(bikes);
    }

    public List<Bike> getBikes()
    {
        return repository.findAll();
    }

    public Bike getBikeById(int id)
    {
        return repository.findById(id).orElse(null);
    }

    public Bike getBikePlateNumber(String bikePlateNumber)
    {
        return repository.findByBikePlateNumber(bikePlateNumber);
    }

    public String deleteBike(int id) {
        repository.deleteById(id);
        return "bike removed !! " + id;
    }

    public Bike updateBike(Bike bike) {
        Bike existingBike = repository.findById(bike.getId()).orElse(null);
        existingBike.setBikePlateNumber(bike.getBikePlateNumber());
        return repository.save(existingBike);
    }

}
