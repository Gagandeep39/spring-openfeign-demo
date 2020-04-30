/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-30 18:08:22
 * @modify date 2020-04-30 18:08:22
 * @desc [description]
 */
package com.gagan.feignrestservice.repository;

import com.gagan.feignrestservice.model.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}