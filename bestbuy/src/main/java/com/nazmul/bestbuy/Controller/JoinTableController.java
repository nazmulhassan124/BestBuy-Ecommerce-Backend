package com.nazmul.bestbuy.Controller;

import com.nazmul.bestbuy.Service.JoinTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/joinTable")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class JoinTableController {

    @Autowired
    JoinTableService joinTableService;


    //3 Join Tables   Purchase_details, Product, Vendor

    @GetMapping("/getAll")
    public List<Object[]> getAllProductAndPurchaseAndVendor(){
        return joinTableService.getAllProductAndPurchaseAndVendor();
    }

}
