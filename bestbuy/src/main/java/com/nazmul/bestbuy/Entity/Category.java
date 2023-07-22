package com.nazmul.bestbuy.Entity;

import com.nazmul.bestbuy.BaseModel.BaseModel;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Category extends BaseModel {

    private String catName;
    private String catDesc;
    private String catImage;
    private boolean isActive;


}
