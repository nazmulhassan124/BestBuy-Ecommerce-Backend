package com.nazmul.bestbuy.Controller;


import com.nazmul.bestbuy.Entity.Product;
import com.nazmul.bestbuy.Entity.SubCategory;

import com.nazmul.bestbuy.Service.SubCategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("p1/subCat")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class SubCategoryController {




    @Autowired
    SubCategoryService subCatService;

    @PostMapping("/post")
    public SubCategory post(@RequestBody SubCategory subcat) {

        return subCatService.post(subcat);
    }


    @GetMapping("/get/{id}")
    public SubCategory get(@PathVariable Long id) {

        return subCatService.getById(id);
    }

    @PutMapping("/update")
    public SubCategory update(@RequestBody SubCategory vendor) {

        return subCatService.update(vendor);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        return subCatService.delete(id);
    }

    @GetMapping("/getAll")
    public List<SubCategory> getAll() {
        return  subCatService.getAllCategory();
    }


    @GetMapping("/getCategoryWiseSubCat")
    public List<SubCategory> getCategoryWiseProduct(@RequestParam(value="catId") Long catid) {
        return subCatService.getSubCatbyCat(catid);
    }

}
