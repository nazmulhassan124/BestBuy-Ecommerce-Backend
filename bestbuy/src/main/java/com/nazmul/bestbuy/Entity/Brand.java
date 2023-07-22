package com.nazmul.bestbuy.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Brand {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long brandId;
    private String brandName;
    private String brandImage;
    private String description;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "catId")
    private Category category;  //fk

    private String catName;
    private boolean isActive;
}
