package io.furqonajiy.inventory_management_system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.furqonajiy.inventory_management_system.model.Inventory;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, String> {
    
}
