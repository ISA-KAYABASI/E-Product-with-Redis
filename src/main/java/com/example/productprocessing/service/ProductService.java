package com.example.productprocessing.service;


import com.example.productprocessing.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    Product saveProduct(Product product);

    Product getProductById(Long id);

    List<Product> getProductName(String productName);

    List<Product> getActives(boolean active);
}
