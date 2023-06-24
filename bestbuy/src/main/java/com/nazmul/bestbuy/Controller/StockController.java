package com.nazmul.bestbuy.Controller;


import com.nazmul.bestbuy.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stock")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class StockController {

    @Autowired
    StockService stockService;

    //Stock table and Product table
    @GetMapping("/getAll")
    public List<Object[]> getAll() {
        return stockService.getAllStock();
    }


}
