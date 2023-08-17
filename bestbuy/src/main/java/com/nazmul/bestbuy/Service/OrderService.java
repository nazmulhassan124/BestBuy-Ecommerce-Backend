package com.nazmul.bestbuy.Service;

import com.nazmul.bestbuy.Entity.OrderDetails;
import com.nazmul.bestbuy.Entity.Orders;
import com.nazmul.bestbuy.Repository.OrderDetailsRepository;
import com.nazmul.bestbuy.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {


    @Autowired
    OrderRepository orderRepository;

    @Autowired
    OrderDetailsRepository orderDetailsRepository;


    public Orders post(Orders order) {
        if(!order.equals(null)) {
            return orderRepository.save(order);
        }
        return null;
    }


    public List<Orders> getOrderList(Long userId) {
        return orderRepository.getOrderList(userId);
    }

    public List<Orders> getAllOrderList() {
        return orderRepository.findAll();
    }


    public void updateStatus(Long orderId, String status) {
        System.out.println("------------hit"+orderId+"--"+status);
        orderRepository.updateStatus(orderId, status);
    }


    public Orders getOrderDetails(Long id, Long orderId) {
     return    orderRepository.getOrderDetails(id,orderId);
    }

    public List<OrderDetails> getOrderDetailsList(Long id, Long orderId) {

        return  orderDetailsRepository.getOrderDetailsList(id,orderId);
    }
}
