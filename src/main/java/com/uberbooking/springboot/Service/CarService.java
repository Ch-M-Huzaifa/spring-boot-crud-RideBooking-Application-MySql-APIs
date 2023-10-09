package com.uberbooking.springboot.Service;

import com.uberbooking.springboot.Entity.Car;
import com.uberbooking.springboot.Repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private  CarRepository repository;


    public Car saveCar(Car car) {
        return repository.save(car);
    }

    public List<Car> saveAllCars(List<Car> cars) {
        return repository.saveAll(cars);
    }

    public List<Car> getCars() {
        return repository.findAll();
    }

    public Optional<Car> getCarById(int carId) {
        return repository.findById(carId);
    }

    public Car getCarPlateNumber(String carPlateNumber) {
        return repository.findByCarPlateNumber(carPlateNumber);
    }

    public String deleteCar(int carId) {
        repository.deleteById(carId);
        return "Car removed !! " + carId;
    }

    public Car updateCar(Car car) {
        Car existingCar = repository.findById(car.getId()).orElse(null);
        existingCar.setCarPlateNumber(car.getCarPlateNumber());
        return repository.save(existingCar);
    }
}
