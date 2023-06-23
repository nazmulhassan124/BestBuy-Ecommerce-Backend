package com.nazmul.bestbuy.Repository;

import com.nazmul.bestbuy.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Long> {


    @Query(value = "SELECT * FROM orders where user_id =? ", nativeQuery = true)
    List<Orders> getOrderList(Long userId);

    @Transactional
    @Modifying
    @Query(value ="update orders u set u.status = :status where u.order_id = :id",  nativeQuery = true)
    void updateStatus(@Param("id") Long id, @Param("status") String status);

}
