package com.uberbooking.springboot.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "ride_tbl")
public class Ride {

    //Customer and Ride Relationship
    @ManyToOne//Customers can have multiple rides, but each ride belongs to one customer.
    @JoinColumn(name = "customer_id") // Name of the foreign key column in the Ride table
    private Customer customer;

    //Driver and Ride Relationship
    @ManyToOne//Drivers can have multiple rides, but each ride belongs to one driver.
    @JoinColumn(name = "driver_id") // Name of the foreign key column in the Ride table
    private Driver driver;

    //Car and Ride Relationship
    @ManyToOne//Cars can be used in multiple rides, but each ride is associated with one car.
    @JoinColumn(name = "car_id") // Name of the foreign key column in the Ride table
    private Car car;

     //Bike and Ride Relationship
    @ManyToOne//Bikes can be used in multiple rides, but each ride is associated with one bike.
    @JoinColumn(name = "bike_id") // Name of the foreign key column in the Ride table
    private Bike bike;
    @Id
    @GeneratedValue
    private long id;
    private double distanceToTravel;
    private int estimatedTime;
    private int numberOfTyres;

    private boolean hasRide;



    public Ride(long id, double distanceToTravel, int estimatedTime, int numberOfTyres, boolean hasRide) {
        this.id = id;
        this.distanceToTravel = distanceToTravel;
        this.estimatedTime = estimatedTime;
        this.numberOfTyres = numberOfTyres;
        this.hasRide=hasRide;
    }
}
