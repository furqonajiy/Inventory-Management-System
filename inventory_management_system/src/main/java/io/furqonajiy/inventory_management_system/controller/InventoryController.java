package io.furqonajiy.inventory_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.furqonajiy.inventory_management_system.repository.InventoryRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.furqonajiy.inventory_management_system.model.Inventory;
import io.furqonajiy.inventory_management_system.repository.InventoryRepository;

@RestController
@RequestMapping("/api/v1/")
public class InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    // Get All Inventory
    @GetMapping("/inventories")
    public List<Inventory> GetAllInventories() {
        return inventoryRepository.findAll();
    }
}