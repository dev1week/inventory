package com.grizz.inventoryapp.inventory.service.repository;

import com.grizz.inventoryapp.inventory.service.repository.entity.InventoryEntity;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public interface InventoryJpaRepository {
    @NotNull Optional<InventoryEntity> findByItemId(@NotNull String itemId);
}
