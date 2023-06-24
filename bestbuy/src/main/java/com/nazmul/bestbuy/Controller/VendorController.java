package com.nazmul.bestbuy.Controller;

import com.nazmul.bestbuy.Entity.Vendor;
import com.nazmul.bestbuy.Service.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendor")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class VendorController {



    @Autowired
    VendorService vendorService;

    @PostMapping("/post")
    public Vendor post(@RequestBody Vendor vendor) {

        return vendorService.post(vendor);
    }


    @GetMapping("/get/{id}")
    public Vendor get(@PathVariable Long id) {

        return vendorService.getById(id);
    }

    @PutMapping("/update")
    public Vendor update(@RequestBody Vendor vendor) {

        return vendorService.update(vendor);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        return vendorService.delete(id);
    }

    @GetMapping("/getAll")
    public List<Vendor> getAll() {
        return vendorService.getAllCategory();
    }


}
