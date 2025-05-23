package com.grizz.inventoryapp.inventory.service;

import com.grizz.inventoryapp.inventory.repository.InventoryJpaRepositoryStub;
import com.grizz.inventoryapp.inventory.service.domain.Inventory;
import com.grizz.inventoryapp.inventory.service.repository.InventoryJpaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InventoryServiceTest {
    InventoryService sut;
    InventoryJpaRepositoryStub inventoryJpaRepository;

    @BeforeEach
    void setUpAll(){
        sut = new InventoryService(inventoryJpaRepository);
        inventoryJpaRepository = new InventoryJpaRepositoryStub();
    }
    @Nested
    class FindByItemId {

        final String existingItemId = "1";
        final Long stock = 10L;

        @BeforeEach
        void setUp(){
            inventoryJpaRepository.addInventoryEntity(existingItemId, stock);
        }

        @DisplayName("itemId를 갖는 entity를 찾지 못하면, null을 반환한다")
        @Test
        void test1() {

            //given
            final String nonExistingItemId = "2";

            //when
            final Inventory result = sut.findByItemId(nonExistingItemId);

            //then
            assertNull(result);

        }

        @DisplayName("itemId를 갖는 entity를 찾으면, inventory를 반환한다")
        @Test
        void test1000() {
            //given
            final String existingItemId = "2";
            final Long stock = 10L;

            //when
            final Inventory result = sut.findByItemId(existingItemId);


            //then
            assertNotNull(result);
            assertEquals(existingItemId, result.getItemId());
            assertEquals(stock, result.getStock());

        }
    }

    @Nested
    class DecreaseByItemId {
        @DisplayName("quantity가 음수라면, Exception을 throw한다")
        @Test
        void test1() {
            throw new NotImplementedTestException();
        }

        @DisplayName("itemId를 갖는 entity를 찾지 못하면, Exception을 throw한다")
        @Test
        void test2() {
            throw new NotImplementedTestException();
        }

        @DisplayName("quantity가 stock보다 크면, Exception을 throw한다")
        @Test
        void test3() {
            throw new NotImplementedTestException();
        }


        @DisplayName("변경된 entity가 없다면, Exception을 throw한다")
        @Test
        void test4() {
            throw new NotImplementedTestException();
        }

        @DisplayName("itemId를 갖는 entity를 찾으면, stock을 차감하고 inventory를 반환한다")
        @Test
        void test1000() {
            throw new NotImplementedTestException();
        }
    }

    @Nested
    class UpdateStock {
        @DisplayName("수정할 stock이 유효하지 않다면, Exception을 throw한다")
        @Test
        void test1() {
            throw new NotImplementedTestException();
        }

        @DisplayName("itemId를 갖는 entity를 찾지 못하면, Exception을 throw한다")
        @Test
        void test2() {
            throw new NotImplementedTestException();
        }

        @DisplayName("itemId를 갖는 entity를 찾으면, stock을 수정하고 inventory를 반환한다")
        @Test
        void test1000() {
            throw new NotImplementedTestException();
        }
    }
}
