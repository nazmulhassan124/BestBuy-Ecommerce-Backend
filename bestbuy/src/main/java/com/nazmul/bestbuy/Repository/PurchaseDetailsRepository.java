package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.PurchaseDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseDetailsRepository extends JpaRepository<PurchaseDetails, Long> {
}
