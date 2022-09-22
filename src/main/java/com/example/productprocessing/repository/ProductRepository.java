package com.example.productprocessing.repository;

import com.example.productprocessing.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    List<Product> findByProductName(String productName);

    List<Product> findByActive(boolean active);
}
