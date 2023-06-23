package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
    @Query(value = "SELECT * FROM cart where user_id =? ", nativeQuery = true)
    List<Cart> getCartList(Long userId);

}
