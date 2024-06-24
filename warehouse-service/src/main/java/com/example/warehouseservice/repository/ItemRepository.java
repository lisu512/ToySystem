package com.example.warehouseservice.repository;

import com.example.warehouseservice.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Integer> {
    List<Item> findByLocation(String location);
}
