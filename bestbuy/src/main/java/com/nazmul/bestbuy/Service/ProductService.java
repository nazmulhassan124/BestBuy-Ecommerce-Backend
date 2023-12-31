package com.nazmul.bestbuy.Service;

import com.nazmul.bestbuy.Entity.Product;
import com.nazmul.bestbuy.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {


    @Autowired
    ProductRepository productRepository;

    public Product post(Product product) {
        if(!product.equals(null)) {
            return productRepository.save(product);
        }
        return null;
    }

    public Product getById(Long id) {
        Optional<Product> optional = productRepository.findById(id);
        if(optional.isPresent()) {
            return optional.get();
        }
        return null;
    }

    public Product update(Product product) {
        return productRepository.save(product);
    }

    public String delete(long id) {
        Optional<Product> optional = productRepository.findById(id);
        if(optional.isPresent()) {
            productRepository.delete(optional.get());
            return null;
        }
        return "fail";
    }

    public List<Product> modelList() {
        return productRepository.findAll();
    }

    public List<Product> postAll(List<Product> modelList) {
        return productRepository.saveAll(modelList);
    }

    public List<Product> getCategoryWiseProduct(String catname) {
        return productRepository.getCategoryWiseProduct(catname);
    }


}
