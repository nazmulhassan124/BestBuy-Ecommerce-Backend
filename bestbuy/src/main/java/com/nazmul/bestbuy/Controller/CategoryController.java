package com.nazmul.bestbuy.Controller;

import com.nazmul.bestbuy.Entity.Category;
import com.nazmul.bestbuy.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/p1/category")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CategoryController {



    @Autowired
    CategoryService categoryService;

    @PostMapping("/post")
    public Category post(@RequestBody Category category) {

        return categoryService.post(category);
    }


    @GetMapping("/get/{id}")
    public Category get(@PathVariable Long id) {

        return categoryService.getById(id);
    }

    @PutMapping("/update")
    public Category update(@RequestBody Category category) {

        return categoryService.update(category);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {

        return categoryService.delete(id);
    }

    @GetMapping("/getAll")
    public List<Category> getAll() {

        return categoryService.getAllCategory();
    }

    @PostMapping("/postAll")
    public List<Category> postAll(@RequestBody List<Category> modelList) {

        return categoryService.postAll(modelList);
    }

    @GetMapping("/catnamelist")
    public List<Category> getAllPcategoryName(){
        return categoryService.getAllPcategoryName();
    }





}
