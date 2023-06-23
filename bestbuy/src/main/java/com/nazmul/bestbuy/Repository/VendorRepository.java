package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository  extends JpaRepository<Vendor, Long> {
}
