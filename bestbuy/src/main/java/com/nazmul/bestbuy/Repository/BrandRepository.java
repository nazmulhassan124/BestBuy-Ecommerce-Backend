package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.Brand;

import com.nazmul.bestbuy.Entity.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface BrandRepository   extends JpaRepository<Brand, Long> {

    @Query(value = "SELECT * FROM brand where cat_id = :catid ", nativeQuery = true)
    List<Brand> getBrandbyCat (@Param("catid") Long cat_id);

}
