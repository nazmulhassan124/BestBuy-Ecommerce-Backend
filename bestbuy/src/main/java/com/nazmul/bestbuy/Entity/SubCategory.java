package com.nazmul.bestbuy.Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Data
@Getter
@Setter
public class SubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long subCatId;
    private String subCatName;
    private String subCatDesc;
    private String subCatImage;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "catId")
    private Category category;  //fk

    private String catName;
    private boolean isActive;
}
