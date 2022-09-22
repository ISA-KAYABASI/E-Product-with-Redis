package com.example.productprocessing.entity;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import net.bytebuddy.utility.nullability.NeverNull;
import reactor.util.annotation.NonNullApi;
import reactor.util.annotation.Nullable;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String productName;

    private String expirationDate;

    private Double price;

    private String moneyCurrency;

    private boolean active;


}