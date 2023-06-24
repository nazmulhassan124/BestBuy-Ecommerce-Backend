package com.nazmul.bestbuy.Controller;

import com.nazmul.bestbuy.Entity.PurchaseDetails;
import com.nazmul.bestbuy.Service.PurchaseDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/purchase")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class PurchaseDetailsController {



    @Autowired
    PurchaseDetailsService purchaseDetailsService;

    @PostMapping("/post")
    public PurchaseDetails post(@RequestBody PurchaseDetails purchaseDetails) {

        return purchaseDetailsService.post(purchaseDetails);
    }


    @GetMapping("/get/{id}")
    public PurchaseDetails get(@PathVariable Long id) {

        return purchaseDetailsService.getById(id);
    }

    @PutMapping("/update")
    public PurchaseDetails update(@RequestBody PurchaseDetails purchaseDetails) {

        return purchaseDetailsService.update(purchaseDetails);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        return purchaseDetailsService.delete(id);
    }

    @GetMapping("/getAll")
    public List<PurchaseDetails> getAll() {
        return purchaseDetailsService.getAll();
    }



}
