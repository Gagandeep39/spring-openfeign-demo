/**
 * @author Gagandeep Singh
 * @email singh.gagandeep3911@gmail.com
 * @create date 2020-04-30 18:08:15
 * @modify date 2020-04-30 18:08:15
 * @desc [description]
 */
package com.gagan.feignrestclient.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Product {

    private Integer id;
    private String name;
    private Double quantity;

}