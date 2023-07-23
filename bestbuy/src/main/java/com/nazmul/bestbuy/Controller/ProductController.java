package com.nazmul.bestbuy.Controller;


import com.nazmul.bestbuy.Entity.Product;
import com.nazmul.bestbuy.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("p1/product")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/post")
    public Product post(@RequestBody Product product) {
        return productService.post(product);
    }


    @GetMapping("/getById/{id}")
    public Product getById(@PathVariable Long id) {
        return productService.getById(id);
    }

    @PutMapping("/update")
    public Product update(@RequestBody Product product) {
        return productService.update(product);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return productService.delete(id);
    }

    @GetMapping("/getAll")
    public List<Product> getAll() {
        return productService.modelList();
    }

    @PostMapping("/postAll")
    public List<Product> postAll(@RequestBody List<Product> modelList) {
        return productService.postAll(modelList);
    }

    @GetMapping("/getCategoryWiseProduct")
    public List<Product> getCategoryWiseProduct(@RequestParam(value="catName") String catName) {
        return productService.getCategoryWiseProduct(catName);
    }



}
