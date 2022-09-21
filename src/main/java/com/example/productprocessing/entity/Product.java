package com.example.productprocessing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name= "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long  id ;
    @Column(name = "product_name", nullable = false)
    private String productName;
    @Column(name = "expiration_date")
    private String expirationDate;
    @Column(name = "price")
    private Double price;
    @Column(name = "money_Currency")
    private String moneyCurrency;
    @Column(name = "activeOrPassive")
    private boolean active;

    @Temporal(TemporalType.DATE)
    @Column(name = "created_time")
    private Date datecreated;


}