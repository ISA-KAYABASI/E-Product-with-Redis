package com.example.productprocessing.controller;

import com.example.productprocessing.dao.ProductDao;
import com.example.productprocessing.entity.ProductCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/productCache")
public class RedisController {

    @Autowired
    private ProductDao productDao;

    @PostMapping
    public ProductCache save(@RequestBody ProductCache productCache) {
        return productDao.save(productCache);
    }

    @GetMapping
    public List<ProductCache> getAllProducts() {
        return productDao.findAll();
    }

    @GetMapping("/{id}")
    public ProductCache findProduct(@PathVariable int id) {
        return productDao.findProductById(id);
    }
    @DeleteMapping("/{id}")
    public String remove(@PathVariable int id)   {
        return productDao.deleteProduct(id);
    }

}
