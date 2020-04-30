package com.gagan.feignrestservice.service.implementation;

import java.util.List;

import com.gagan.feignrestservice.model.Product;
import com.gagan.feignrestservice.repository.ProductRepository;
import com.gagan.feignrestservice.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProduct(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public List<Product> fetchAll() {
        return productRepository.findAll();
    }

}