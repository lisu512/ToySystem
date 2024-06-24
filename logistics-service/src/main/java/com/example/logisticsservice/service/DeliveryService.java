package com.example.logisticsservice.service;

import com.example.logisticsservice.entity.Delivery;
import com.example.logisticsservice.repository.DeliveryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeliveryService {

    @Autowired
    private DeliveryRepository deliveryRepository;

    public Delivery createDelivery(Delivery delivery) {
        return deliveryRepository.save(delivery);
    }

    public List<Delivery> getDeliveriesByOrderId(Integer orderId) {
        return deliveryRepository.findByOrderId(orderId);
    }
}
