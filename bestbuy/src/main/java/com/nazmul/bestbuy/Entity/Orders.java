package com.nazmul.bestbuy.Entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Entity
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="order_id")
    private Long orderId;
    private Long userId;
    private Integer nitPrice;
    private Integer totalPrice;
    @CreationTimestamp
    private LocalDateTime createdDateTime;


    private String name;
    private String email;
    private String address;
    private String status;
    private String contact;

//    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
@OneToMany(targetEntity = OrderDetails.class,cascade = CascadeType.ALL)
@JoinColumn(name ="order_id_fk",referencedColumnName = "order_id")
    private List<OrderDetails> orderDetails;





}
