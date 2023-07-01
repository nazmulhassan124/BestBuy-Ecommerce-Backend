package com.nazmul.bestbuy.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pro_id;

    private long catid;
    private String pro_name;
    private String pro_cat;
    private String pro_image;
    private int pro_price;
    private String pro_desc;




}
