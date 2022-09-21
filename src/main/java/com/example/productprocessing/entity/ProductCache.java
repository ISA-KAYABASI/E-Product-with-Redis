package com.example.productprocessing.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@RedisHash("ProductCache")
public class ProductCache implements Serializable {

    @Id
    private Long id;
    private String productName;
    private String expirationDate;
    private Double price;
    private String moneyCurrency;
    private boolean active;



}
