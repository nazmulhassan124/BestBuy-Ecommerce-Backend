package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository   extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT * FROM product where pro_cat =? ", nativeQuery = true)
    List<Product> getCategoryWiseProduct(String catname);
}
