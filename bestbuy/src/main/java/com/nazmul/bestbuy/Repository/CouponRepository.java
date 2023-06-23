package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository  extends JpaRepository<Coupon, Long> {

    @Query(value = "SELECT * FROM coupon where coupon_code =? limit 1", nativeQuery = true)
    Coupon getByCouponCode(String couponCode);


}
