package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository  extends JpaRepository<Category, Long> {

    @Query(value = "SELECT * FROM category ", nativeQuery = true)
    List<Category> getAllPcategoryName();
}
