package com.grizz.inventoryapp.inventory.repository;

import com.grizz.inventoryapp.inventory.service.repository.InventoryJpaRepository;
import com.grizz.inventoryapp.inventory.service.repository.entity.InventoryEntity;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

public class InventoryJpaRepositoryStub implements InventoryJpaRepository {
    private final List<InventoryEntity> inventoryEntities= new ArrayList<>();

    private final AtomicLong idGenerator = new AtomicLong(1);
    public void addInventoryEntity(@NotNull String existingItemId, @NotNull Long stock){
        final Long id = idGenerator.getAndIncrement();
        inventoryEntities.add(new InventoryEntity(id,existingItemId, stock));
    };

    @Override
    public @NotNull Optional<InventoryEntity> findByItemId(@NotNull String itemId) {
        return inventoryEntities.stream()
                .filter(entity->entity.getItemId().equals(itemId))
                .findFirst();
    }
}
