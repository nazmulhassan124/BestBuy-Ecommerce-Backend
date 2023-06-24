package com.nazmul.bestbuy.Controller;


import com.nazmul.bestbuy.Entity.Cart;
import com.nazmul.bestbuy.Service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class CartController {


    @Autowired
    CartService cartService;

    @PostMapping("/post")
    public Cart post(@RequestBody Cart cart) {
        return cartService.post(cart);
    }

    @GetMapping("/getCartList")
    public List<Cart> getCartList(@RequestParam(value="userId") Long id) {
        return cartService.getCartList(id);
    }

    @DeleteMapping("/delete/{id}")
    public String removeToCart(@PathVariable Long id){
        return cartService.removeToCart(id);
    }

}
