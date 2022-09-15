package com.example.productprocessing.controller;


import com.example.productprocessing.entity.Product;
import com.example.productprocessing.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class StudentController {

    private ProductService productService;

    public StudentController(ProductService productService) {
        super();
        this.productService = productService;
    }

    //handler method to handle list products and view and return
    @GetMapping("/")
    public String listProducts(Model model){
        model.addAttribute("products", productService.getAllProduct());
        return "products";
    }

    //This method is called for open product create form
    @GetMapping("/products/new")
    public String createProductForm(Model model){
        Product product = new Product();
        model.addAttribute("product", product);
        return "create_product";
    }

       //Save the product to the database
    @PostMapping("/products")
    public String saveProduct(@ModelAttribute("product") Product product){
        productService.saveProduct(product);
        return "redirect:/products";
    }

}
