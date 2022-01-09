package io.furqonajiy._ims.javaspringbackend.controller;

import io.furqonajiy._ims.javaspringbackend.model.Inventory;
import io.furqonajiy._ims.javaspringbackend.repository.InventoryRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    // Get All Inventory
    @GetMapping("/inventory")
    public List<Inventory> GetAllInventories() {
        return inventoryRepository.findAll();
    }
}