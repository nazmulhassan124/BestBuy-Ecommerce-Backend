package com.nazmul.bestbuy.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class OrderDetails {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long order_details_id;

    private Long cart_id;
    private Long  userId;
    private Long id;  //product id
    private long catId;
    private String name;  // product name
    private String catName;  // pro cat name
    private String productImage_1;
    private double regularPrice;
    private double offerPrice;
    private String description;
    private int quantity;

//   @ManyToOne
//   @JoinColumn(name = "order_id")
//    private Orders orders;
}
