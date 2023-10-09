package com.uberbooking.springboot.Entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CAR_TBL")
public class Car {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "carMake")
    private String carMake;
    @Column(name = "carModel")
    private String carModel;
    @Column(name = "carPlateNumber")
    private String carPlateNumber;
    @Column(name = "CarTyres")
    private int numberOfTyres;
    @Column(name = "Is_Car_Available")
    private boolean available;

    public Car(String carMake, String carModel, String carPlateNumber, int numberOfTyres, boolean available) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carPlateNumber = carPlateNumber;
        this.numberOfTyres = numberOfTyres;
        this.available = available;
    }
}
