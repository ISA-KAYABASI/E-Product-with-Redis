package com.example.productprocessing.service.Impl;

import com.example.productprocessing.entity.Product;
import com.example.productprocessing.repository.ProductRepository;
import com.example.productprocessing.service.ProductService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        super();
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> getProductName(String productName) {
        return productRepository.findByProductName(productName);
    }

    @Override
    public List<Product> getActives(boolean active) {
        return productRepository.findByActive(active);
    }


}
