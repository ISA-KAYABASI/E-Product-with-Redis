package com.example.productprocessing.repository;

import com.example.productprocessing.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
