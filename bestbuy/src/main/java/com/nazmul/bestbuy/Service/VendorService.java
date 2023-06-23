package com.nazmul.bestbuy.Service;

import com.nazmul.bestbuy.Entity.Vendor;
import com.nazmul.bestbuy.Repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VendorService {


    @Autowired
    VendorRepository vendorRepository;

    public Vendor post(Vendor vendor) {
        if(!vendor.equals(null)) {
            return vendorRepository.save(vendor);
        }
        return null;
    }

    public Vendor getById(Long id) {
        Optional<Vendor> optional = vendorRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public Vendor update(Vendor vendor) {
        return vendorRepository.save(vendor);
    }

    public String delete(Long id) {
        Optional<Vendor> optional = vendorRepository.findById(id);
        if(optional.isPresent()) {
            vendorRepository.delete(optional.get());
            return null;
        }
        return "fail";
    }

    public List<Vendor> getAllCategory() {

        return vendorRepository.findAll();
    }


    public List<Vendor> postAll(List<Vendor> vendor) {

        return vendorRepository.saveAll(vendor);
    }



}
