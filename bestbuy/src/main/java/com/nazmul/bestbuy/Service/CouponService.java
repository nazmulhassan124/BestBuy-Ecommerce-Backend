package com.nazmul.bestbuy.Service;

import com.nazmul.bestbuy.Entity.Coupon;
import com.nazmul.bestbuy.Repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CouponService {

    @Autowired
    CouponRepository couponRepository;

    public Coupon post(Coupon coupon) {
        if(!coupon.equals(null)) {
            return couponRepository.save(coupon);
        }
        return null;
    }

//	public Coupon getById(Long id) {
//		Optional<Coupon> optional = couponRepository.findById(id);
//		if(optional.isPresent()) {
//			return optional.get();
//		}
//		return null;
//	}


    public Coupon update(Coupon coupon) {
        return couponRepository.save(coupon);
    }

    public String delete(Long id) {
        Optional<Coupon> optional = couponRepository.findById(id);
        if(optional.isPresent()) {
            couponRepository.delete(optional.get());
            return null;
        }
        return "fail";
    }

    public List<Coupon> getAllCoupon() {
        return couponRepository.findAll();
    }


    public Coupon getByCouponCode(String couponCode) {
        return couponRepository.getByCouponCode(couponCode);
    }


}
