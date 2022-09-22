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

    private String productName;

    private String expirationDate;

    private Double price;

    private String moneyCurrency;

    private boolean active;


}