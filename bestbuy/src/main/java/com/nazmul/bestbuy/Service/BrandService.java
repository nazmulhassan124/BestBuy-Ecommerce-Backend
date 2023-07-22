package com.nazmul.bestbuy.Service;

import com.nazmul.bestbuy.Entity.Brand;
import com.nazmul.bestbuy.Entity.Vendor;
import com.nazmul.bestbuy.Repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandService {


    @Autowired
    BrandRepository brandRepo;

    public Brand post(Brand brand) {
        if(!brand.equals(null)) {
            return brandRepo.save(brand);
        }
        return null;
    }

    public Brand getById(Long id) {
        Optional<Brand> optional = brandRepo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public Brand update(Brand brand) {
        return brandRepo.save(brand);
    }

    public String delete(Long id) {
        Optional<Brand> optional = brandRepo.findById(id);
        if(optional.isPresent()) {
            brandRepo.delete(optional.get());
            return null;
        }
        return "fail";
    }

    public List<Brand> getAllCategory() {

        return brandRepo.findAll();
    }


    public List<Brand> postAll(List<Brand> brand) {

        return brandRepo.saveAll(brand);
    }



}
