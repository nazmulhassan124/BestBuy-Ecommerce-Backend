package com.nazmul.bestbuy.Controller;

import com.nazmul.bestbuy.Entity.Brand;
import com.nazmul.bestbuy.Entity.Category;
import com.nazmul.bestbuy.Entity.Product;
import com.nazmul.bestbuy.Entity.SubCategory;
import com.nazmul.bestbuy.Service.BrandService;
import com.nazmul.bestbuy.Service.CategoryService;
import com.nazmul.bestbuy.Service.ProductService;
import com.nazmul.bestbuy.Service.SubCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("p2")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class HomeController {

    @Autowired
    ProductService productService;
    @Autowired
    CategoryService categoryService;
    @Autowired
    BrandService brandService;
    @Autowired
    SubCategoryService subCatService;

    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct() {

        return productService.modelList();
    }

    @GetMapping("/getAllCategory")
    public List<Category> getAllCategory() {

        return categoryService.getAllCategory();
    }

    @GetMapping("/getAllSubCat")
    public List<SubCategory> getAllSubcategory() {
        return  subCatService.getAllCategory();
    }

    @GetMapping("/getAllBrand")
    public List<Brand> getAllBrand() {
        return brandService.getAllCategory();
    }




}
