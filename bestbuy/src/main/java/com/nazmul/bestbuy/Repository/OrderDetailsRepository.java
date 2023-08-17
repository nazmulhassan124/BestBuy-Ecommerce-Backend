package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.OrderDetails;
import com.nazmul.bestbuy.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrderDetailsRepository extends JpaRepository<OrderDetails, Long> {


    //order details list

    @Query(value = "SELECT * FROM order_details where user_id =? and order_id_fk=?", nativeQuery = true)
    List<OrderDetails> getOrderDetailsList(Long userId , Long order_id_fk);

}
