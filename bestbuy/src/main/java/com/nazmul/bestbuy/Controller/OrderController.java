package com.nazmul.bestbuy.Controller;

import com.nazmul.bestbuy.Entity.OrderDetails;
import com.nazmul.bestbuy.Entity.Orders;
import com.nazmul.bestbuy.Service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class OrderController {


    @Autowired
    OrderService orderService;

    @PostMapping("/post")
    public Orders post(@RequestBody Orders order) {

        return orderService.post(order);
    }

    @GetMapping("/getOrderList")
    public List<Orders> getOrderList(@RequestParam(value="userId") Long id) {
        return orderService.getOrderList(id);
    }

    @GetMapping("/getOrderDetails")
    public Orders getOrderDetails(@RequestParam(value="userId") Long id ,@RequestParam(value="orderId") Long orderId    ) {
        return orderService.getOrderDetails(id, orderId);
    }

    @GetMapping("/getOrderDetailsList")
    public List<OrderDetails> getOrderDetailsList(@RequestParam(value="userId") Long id , @RequestParam(value="order_id_fk") Long orderId    ) {
        return orderService.getOrderDetailsList(id, orderId);
    }

    @GetMapping("/getAllOrderList")
    public List<Orders> getAllOrderList() {
        return orderService.getAllOrderList();
    }

    @PostMapping("/updateStatus")
    public void updateStatus(@RequestParam(value="orderId") Long id, @RequestParam(value="status") String status) {
        orderService.updateStatus(id, status);
    }


}
