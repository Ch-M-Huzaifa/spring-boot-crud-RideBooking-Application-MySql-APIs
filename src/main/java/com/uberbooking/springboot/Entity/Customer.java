package com.uberbooking.springboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CUSTOMER_TBL")
public class Customer {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String email;
    private double phone;
    private String password;


    public Customer(Integer id, String name, String email, double phone, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}
