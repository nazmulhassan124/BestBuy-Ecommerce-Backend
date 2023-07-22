package com.nazmul.bestbuy.Service;

import com.nazmul.bestbuy.Entity.Brand;
import com.nazmul.bestbuy.Entity.SubCategory;
import com.nazmul.bestbuy.Repository.BrandRepository;
import com.nazmul.bestbuy.Repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubCategoryService {


    @Autowired
    SubCategoryRepository subCatRepo;





    public SubCategory post(SubCategory subcat) {
        if(!subcat.equals(null)) {
            return subCatRepo.save(subcat);
        }
        return null;
    }

    public SubCategory getById(Long id) {
        Optional<SubCategory> optional = subCatRepo.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public SubCategory update(SubCategory brand) {
        return subCatRepo.save(brand);
    }

    public String delete(Long id) {
        Optional<SubCategory> optional = subCatRepo.findById(id);
        if(optional.isPresent()) {
            subCatRepo.delete(optional.get());
            return null;
        }
        return "fail";
    }

    public List<SubCategory> getAllCategory() {

        return subCatRepo.findAll();
    }


    public List<SubCategory> postAll(List<SubCategory> brand) {

        return subCatRepo.saveAll(brand);
    }

}
