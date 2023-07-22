package com.nazmul.bestbuy.Entity;

import com.nazmul.bestbuy.BaseModel.BaseModel;
import lombok.*;

import javax.persistence.Entity;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product extends BaseModel {


    private String name;
    private double regularPrice;
    private double offerPrice;
    private String description;
    private int quantity;
    private long catId;   //fk
    private String catName;  //fk
    private long SubCatId;    //fk
    private String SubCatName;    //fk

    private long brandId;  //fk
    private String brandName;   //fk
    private String manufacture;
    private String productSize;
    private String productColor;
    private String weight;
    private String productImage_1;
    private String productImage_2;
    private String productImage_3;

//    @ManyToOne
//    private Store store;

//    private String storeName;
//    private String couponCode;

//    @OneToMany(mappedBy = "products")
//    private List<ProductsReviews> productsReviews;
//
//    @OneToMany(mappedBy = "products")
//    private List<QAndA_AboutTheProduct> qAndA_aboutTheProduct;






}
