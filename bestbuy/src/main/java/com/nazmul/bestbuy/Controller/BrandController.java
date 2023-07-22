package com.nazmul.bestbuy.Controller;


import com.nazmul.bestbuy.Entity.Brand;

import com.nazmul.bestbuy.Service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("p1/brand")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class BrandController {

    @Autowired
    BrandService brandService;




    @PostMapping("/post")
    public Brand post(@RequestBody Brand vendor) {

        return brandService.post(vendor);
    }


    @GetMapping("/get/{id}")
    public Brand get(@PathVariable Long id) {

        return brandService.getById(id);
    }

    @PutMapping("/update")
    public Brand update(@RequestBody Brand brand) {

        return brandService.update(brand);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        return brandService.delete(id);
    }

    @GetMapping("/getAll")
    public List<Brand> getAll() {
        return brandService.getAllCategory();
    }


}
