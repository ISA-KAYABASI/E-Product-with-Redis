package com.example.productprocessing.entity;

import javax.persistence.*;

@Lombok
@Entity
@Table(name= "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_name", nullable = false)
    private String productName;
    @Column(name = "expiration_date")
    private String expirationDate;
    @Column(name = "price")
    private String price;
    @Column(name = "money_Currency")
    private String moneyCurrency;

}
