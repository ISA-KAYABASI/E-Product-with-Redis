package com.example.productprocessing.controller;

import com.example.productprocessing.entity.Product;
import com.example.productprocessing.service.ProductService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        super();
        this.productService = productService;
    }

    //handler method to handle list products and view and return
    @GetMapping
    public List<Product> listProducts(){
        return productService.getAllProduct();

    }

//    //This method is called for open product create form
//    @GetMapping("/products/new")
//    public String createProductForm(Model model){
//        Product product = new Product();
//        model.addAttribute("product", product);
//        return "create_product";
//    }

    @PostMapping("/save")
    public String saveProduct(@RequestBody Product product){
        try {
            productService.saveProduct(product);
        } catch (Exception e) {
            return "Saving error please try again.";
        }
        return "Saving success.";
    }


    @PostMapping("/update/{id}")
    public String updateProducts(@PathVariable Long id,
        @RequestBody Product product, Model model ){

        // get product from database by id
        Product existingProduct = productService.getProductById(id);
        existingProduct.setActive(!existingProduct.isActive());
        //save updated product object
        productService.saveProduct(existingProduct);
        return "Product active passive state updated successfully";
    }

    @GetMapping("/name/{productName}")
    public List<Product>  getProductName(@PathVariable String productName) {
        return productService.getProductName(productName);
    }

    @GetMapping("/active/{active}")
    public List<Product> getActives(@PathVariable("active")boolean active) {
        return productService.getActives(active);
    }


}
