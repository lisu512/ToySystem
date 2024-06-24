package com.example.warehouseservice.service;

import com.example.warehouseservice.entity.Item;
import com.example.warehouseservice.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public Optional<Item> getItemById(Integer itemId) {
        return itemRepository.findById(itemId);
    }

    public Item saveItem(Item item) {
        return itemRepository.save(item);
    }
}
