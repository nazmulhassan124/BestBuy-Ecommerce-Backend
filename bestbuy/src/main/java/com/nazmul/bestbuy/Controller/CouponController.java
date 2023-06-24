package com.nazmul.bestbuy.Controller;

import com.nazmul.bestbuy.Entity.Coupon;
import com.nazmul.bestbuy.Service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/coupon")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CouponController {


    @Autowired
    CouponService couponService;

    @PostMapping("/post")
    public Coupon post(@RequestBody Coupon coupon) {
        return couponService.post(coupon);
    }

    @PutMapping("/update")
    public Coupon update(@RequestBody Coupon coupon) {
        return couponService.update(coupon);
    }


    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        return couponService.delete(id);
    }

    @GetMapping("/getAllCouponDetails")
    public List<Coupon> getAll() {
        return couponService.getAllCoupon();
    }


    @GetMapping("/getByCouponCode")
    public Coupon getByCouponCode(@RequestParam(value="couponCode") String couponCode) {
        return couponService.getByCouponCode(couponCode);
    }


}
