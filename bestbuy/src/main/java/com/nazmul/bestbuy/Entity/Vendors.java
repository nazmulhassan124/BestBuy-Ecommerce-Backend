package com.nazmul.bestbuy.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Vendors {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long vendorId;
    private String vendorName;
    private String vendordesc;

    public long getVendorId() {
        return vendorId;
    }
    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public String getVendordesc() {
        return vendordesc;
    }
    public void setVendordesc(String vendordesc) {
        this.vendordesc = vendordesc;
    }


}
