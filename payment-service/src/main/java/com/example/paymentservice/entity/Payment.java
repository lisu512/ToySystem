package com.example.paymentservice.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id", nullable = false)
    private Integer id;

    @Column(name = "order_id", nullable = false)
    private Integer orderId; // 用订单ID而不是Order实体来关联订单

    @Column(name = "amount", precision = 10, scale = 2)
    private BigDecimal amount;

    @Column(name = "payment_status", length = 100)
    private String paymentStatus;

    @Column(name = "payment_method", length = 100)
    private String paymentMethod;

    @ColumnDefault("CURRENT_TIMESTAMP")
    @Column(name = "processed_at")
    private Instant processedAt;
}
