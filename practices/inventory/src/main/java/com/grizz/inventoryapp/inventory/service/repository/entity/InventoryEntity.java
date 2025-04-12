package com.grizz.inventoryapp.inventory.service.repository.entity;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class InventoryEntity {

    private @Nullable Long id;
    private @NotNull String itemId;
    private @NotNull Long stock;

    public InventoryEntity(@NotNull Long id, @NotNull String itemId, @NotNull Long stock) {
        this.id = id;
        this.itemId = itemId;
        this.stock = stock;
    }

    public @NotNull String getItemId() {
        return itemId;
    }

    public Long getStock() {
        return stock;
    }
}
