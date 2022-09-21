package com.example.productprocessing.controller;

import com.example.productprocessing.entity.Product;
import com.example.productprocessing.repository.ProductCacheRepository;
import com.example.productprocessing.entity.ProductCache;
import com.example.productprocessing.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/productCache")
public class RedisController {


    private ProductService productService;
    private final ProductCacheRepository productDao;

    public RedisController(ProductCacheRepository productDao) {
        this.productDao = productDao;
    }

    @PostMapping("/new")
    public ProductCache save(@RequestBody ProductCache productCache) {
        return productDao.save(productCache);
    }

    @GetMapping
    public List<ProductCache> getAllProducts() {
        return productDao.findAll();
    }

    @GetMapping("/{id}")
    public ProductCache findProduct(@PathVariable String id) {
        return productDao.findProductById(id);
    }

    @PostMapping("/sendDB/{id}")
    public Product sendProductToDb(@PathVariable String id) {
        ProductCache existCacheProduct = findProduct(id);
        Product productNew = new Product();
        productNew.setId(1L);
        productNew.setProductName(existCacheProduct.getProductName());
        productNew.setExpirationDate(existCacheProduct.getExpirationDate());
        productNew.setPrice(existCacheProduct.getPrice());
        productNew.setMoneyCurrency(existCacheProduct.getMoneyCurrency());
        productNew.setActive(existCacheProduct.isActive());

        return productService.saveProduct(productNew);
//         productDao.deleteProduct(id);
    }

    @DeleteMapping("/{id}")
    public String remove(@PathVariable String id)   {
        return productDao.deleteProduct(id);
    }

}