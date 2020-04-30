/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-30 18:52:47
 * @modify date 2020-04-30 18:52:47
 * @desc [description]
 */
package com.gagan.feignrestservice.service;

import java.util.List;

import com.gagan.feignrestservice.model.Product;

public interface ProductService {

    Product addProduct(Product product);
    Product getProduct(Integer id);
    List<Product> fetchAll();

}