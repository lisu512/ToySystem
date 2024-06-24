package com.example.logisticsservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "deliveries")
public class Delivery {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delivery_id", nullable = false)
    private Integer id;

    @Column(name = "order_id", nullable = false)
    private Integer orderId; // 用订单ID而不是Order实体来关联订单

    @Lob
    @Column(name = "delivery_address")
    private String deliveryAddress;

    @Column(name = "status", length = 100)
    private String status;

    @Column(name = "scheduled_date")
    private LocalDate scheduledDate;
}
