package com.example.logisticsservice.repository;

import com.example.logisticsservice.entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryRepository extends JpaRepository<Delivery, Integer> {
    List<Delivery> findByOrderId(Integer orderId);
}

