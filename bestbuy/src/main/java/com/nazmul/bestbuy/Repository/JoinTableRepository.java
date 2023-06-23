package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.JoinTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JoinTableRepository  extends JpaRepository<JoinTable, Long> {

    @Query(value = "select pd.purchase_id,qty,date,total,price, p.pro_name,pro_price, v.vendor_name from purchase_details pd, product p, vendor v where pd.pro_id=p.pro_id and pd.vendor_id=v.vendor_id", nativeQuery = true)
    List<Object[]> getAllProductAndPurchaseAndVendor();

}
