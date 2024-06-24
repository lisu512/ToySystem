package com.example.logisticsservice.controller;

import com.example.logisticsservice.entity.Delivery;
import com.example.logisticsservice.service.DeliveryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logistics/deliveries")
public class DeliveryController {

    @Autowired
    private DeliveryService deliveryService;

    @PostMapping
    public ResponseEntity<Delivery> createDelivery(@RequestBody Delivery delivery) {
        return ResponseEntity.ok(deliveryService.createDelivery(delivery));
    }

    @GetMapping("/orders/{orderId}")
    public ResponseEntity<List<Delivery>> getDeliveriesByOrderId(@PathVariable Integer orderId) {
        return ResponseEntity.ok(deliveryService.getDeliveriesByOrderId(orderId));
    }
}
