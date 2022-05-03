package com.exampleali.productmicroservices.controller;

import com.exampleali.productmicroservices.entity.ProductEntity;
import com.exampleali.productmicroservices.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();

    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createdProduct(@RequestBody ProductEntity productEntity){
        productRepository.save(productEntity);
    }
}
