package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.SubCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCategoryRepository  extends JpaRepository<SubCategory, Long> {

    @Query(value = "SELECT * FROM sub_category where cat_id = :catid ", nativeQuery = true)
    List<SubCategory> getSubCatbyCat (@Param("catid") Long cat_id);

}
