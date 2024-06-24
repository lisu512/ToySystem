package com.example.warehouseservice.controller;

import com.example.warehouseservice.entity.Item;
import com.example.warehouseservice.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/warehouse/items")
public class ItemController {

    @Autowired
    private ItemService itemService;

    @GetMapping("/{itemId}")
    public ResponseEntity<Item> getItemById(@PathVariable Integer itemId) {
        return itemService.getItemById(itemId)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
