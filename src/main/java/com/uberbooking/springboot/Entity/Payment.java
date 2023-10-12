package com.uberbooking.springboot.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "payment_tbl")
public class Payment {
    @Id
    @GeneratedValue
    private int id;
    private String paymentMod;

    public Payment(int id, String paymentMod) {
        this.id = id;
        this.paymentMod = paymentMod;
    }

}
