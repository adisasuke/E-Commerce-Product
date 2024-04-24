package org.example.product.controller;

import org.example.product.models.Product;
import org.example.product.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    private ProductService productService;
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable("id") Long id)
    {

        return  productService.getProductById(id);
    }

}
