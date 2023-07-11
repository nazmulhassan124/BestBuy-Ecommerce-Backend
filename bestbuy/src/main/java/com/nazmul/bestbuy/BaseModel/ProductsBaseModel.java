package com.nazmul.bestbuy.BaseModel;

import lombok.Data;

import javax.persistence.MappedSuperclass;

@Data
@MappedSuperclass
public class ProductsBaseModel extends BaseModel{
    private String name;
    private int regularPrice;
    private int offerPrice;
    private String description;
    private int quantity;
    private String category;
    private String subCate;
    private String manufacture;
    private String productSize;
    private String productColor;
    private String weight;
    private String couponCode;
    private String productImage_1;
    private String productImage_2;
    private String productImage_3;

}
