package com.uberbooking.springboot.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "BIKE_TBL")
public class Bike {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "bikeMake")
    private String bikeMake;
    @Column(name = "bikeModel")
    private String bikeModel;
    @Column(name = "bikePlateNumber")
    private String bikePlateNumber;
    @Column(name = "bikeTyres")
    private Integer numberOfTyres;
    @Column(name = "Is_BikeAvailable")
    private boolean available;

    public Bike(Integer id, String bikeMake, String bikeModel, String bikePlateNumber, int numberOfTyres, boolean available) {
        this.id = id;
        this.bikeMake = bikeMake;
        this.bikeModel = bikeModel;
        this.bikePlateNumber = bikePlateNumber;
        this.numberOfTyres = numberOfTyres;
        this.available = available;
    }


}
