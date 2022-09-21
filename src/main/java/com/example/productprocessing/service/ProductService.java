package com.example.productprocessing.service;


import com.example.productprocessing.entity.Product;
import com.example.productprocessing.entity.ProductCache;

import java.util.List;

public interface ProductService {
    List<Product> getAllProduct();

    Product saveProduct(Product product);

    Product getProductById(Long id);




}
