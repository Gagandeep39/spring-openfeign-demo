package com.gagan.feignrestclient.service;

import com.gagan.feignrestclient.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author Gagandeep
 * @date 30-04-2020
 * @time 18:17
 */

/**
 * USed for Intermiceoservice Commnication
 * Act as a microservice COnsumer
 */
@FeignClient(name = "${service.name}", url = "${service.url}")
public interface ProductService {

    @GetMapping("/products/{id}")
    Product fetchById(@PathVariable Integer id);

    @GetMapping("/products")
    List<Product> fetchAll();

    @PostMapping("/products")
    Product addProduct(@RequestBody Product product);

}
