package com.uberbooking.springboot.Controller;

import com.uberbooking.springboot.Entity.Car;
import com.uberbooking.springboot.Service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("car") // Ensure consistency with the controller class request mapping
public class CarController {
    @Autowired

    private CarService carService;

//    @Autowired
//    public CarController(CarService carService) {
//        this.carService = carService;
//    }

    @PostMapping("/registerCar")
    public Car registerCar(@RequestBody Car car) {
        return carService.saveCar(car);
    }

    @PostMapping("/registerCars")
    public List<Car> registerCars(@RequestBody List<Car> cars) {
        return carService.saveAllCars(cars);
    }

    @GetMapping("/all")
    public List<Car> findAllCars() {
        return carService.getCars();
    }

        @GetMapping("/car/{carPlateNumber}")
    public Car findByCarPlateNumber(@PathVariable String  carPlateNumber)
    {
        return carService.getCarPlateNumber(carPlateNumber);
    }


    @DeleteMapping("/delete/{id}")
    public String deleteCar(@PathVariable int id) {
        return carService.deleteCar(id);
    }
}
