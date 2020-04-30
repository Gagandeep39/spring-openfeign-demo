package com.gagan.feignrestclient.controller;

import com.gagan.feignrestclient.model.Product;
import com.gagan.feignrestclient.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Gagandeep
 * @date 30-04-2020
 * @time 18:26
 */

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    Logger logger = LoggerFactory.getLogger(ProductController.class);

    @GetMapping("/products/{id}")
    public Product fetchById(@PathVariable Integer id){
        Product product = productService.fetchById(id);
        logger.info(product.toString());
        return product;
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        logger.info(productService.fetchAll().toString());
        return productService.fetchAll();
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody Product product){
        Product newProduct = productService.addProduct(product);
        logger.info(newProduct.toString());
        return newProduct;
    }

}
