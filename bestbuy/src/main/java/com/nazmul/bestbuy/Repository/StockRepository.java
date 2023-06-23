package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StockRepository  extends JpaRepository<Stock, Long> {


    //Join Table Query
    @Query(value ="select s.stock_id,qty , p.pro_name,pro_price from stock s,product p where s.pro_id=p.pro_id",nativeQuery = true)
    List<Object[]> getAllStock();

}
