package com.simpleshop.repository;

import com.simpleshop.entity.Inventory;

import java.util.List;

/**
 * Created by nmenego on 10/20/16.
 */
public interface InventoryDao {
    /**
     * Retrieves the inventory.
     * @return List
     */
    List<Inventory> getInventoryList();

    /**
     * Retrieves single Inventory from our repository using the itemId.
     * @param id itemId
     * @return a single Inventory
     * @throws Exception Item does not exist
     */
    Inventory getInventory(int id) throws Exception;

    /**
     * Purchases specific Inventory with the given count.
     * @param item Inventory to buy
     * @param count number of items to buy
     * @throws Exception Not enough stock
     */
    void purchaseItem(Inventory item, int count) throws Exception;
}
