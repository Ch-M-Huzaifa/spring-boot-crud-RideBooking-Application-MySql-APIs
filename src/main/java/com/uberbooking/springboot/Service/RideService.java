package com.uberbooking.springboot.Service;

import com.uberbooking.springboot.Entity.Customer;
import com.uberbooking.springboot.Entity.Ride;
import com.uberbooking.springboot.Repository.CustomerRepository;
import com.uberbooking.springboot.Repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class RideService {
    @Autowired
    private RideRepository repository;

    public Ride saveRide(Ride ride){
        return repository.save(ride);
    }

    public List<Ride> getRides()
    {
        return repository.findAll();
    }
    public Ride getRideById(int id)
    {
        return repository.findById(id).orElse(null);
    }
    public String deleteRide(int id) {
        repository.deleteById(id);
        return "ride removed !! " + id;
    }


}
