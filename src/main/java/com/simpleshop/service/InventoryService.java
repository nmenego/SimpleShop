package com.simpleshop.service;

import com.simpleshop.entity.Inventory;
import com.simpleshop.form.OrderForm;

import java.util.List;

/**
 * Created by nmenego on 10/20/16.
 */
public interface InventoryService {

    /**
     * Lists the inventory.
     * @return List of the inventory
     */
    List<Inventory> getInventoryList();

    List<Inventory> executeOrder(OrderForm orderForm) throws Exception;

}
