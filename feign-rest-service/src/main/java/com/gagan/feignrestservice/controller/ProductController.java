/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-30 18:08:13
 * @modify date 2020-04-30 18:08:13
 * @desc [description]
 */
package com.gagan.feignrestservice.controller;

import java.util.List;

import com.gagan.feignrestservice.model.Product;
import com.gagan.feignrestservice.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{id}")
    public Product fetchById(@PathVariable Integer id){
        return productService.getProduct(id);
    }

    @GetMapping("/products")
    public List<Product> fetchAll() throws InterruptedException {
        Thread.sleep(2000);
        return productService.fetchAll();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

}