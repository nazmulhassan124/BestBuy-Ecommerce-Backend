package com.nazmul.bestbuy.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Cart {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cart_id;
    private Long  userId;
    private Long id;  //product id
    private long catId;
    private String name;  // product name
    private String catName;  // pro cat name
    private String productImage_1;
    private double pro_pregularPrice;
    private double offerPrice;
    private String description;
    private int quantity;



}
