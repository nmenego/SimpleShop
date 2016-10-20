package com.simpleshop.service;

import com.simpleshop.entity.Inventory;
import com.simpleshop.form.OrderForm;
import com.simpleshop.repository.InventoryDao;
import com.simpleshop.repository.InventoryDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by nmenego on 10/20/16.
 */
@Service
public class InventoryServiceImpl implements InventoryService {
    @Autowired
    private InventoryDao inventoryDao;
    /**
     * {@inheritDoc}
     */
    public List<Inventory> getInventoryList() {

        return inventoryDao.getInventoryList();
    }

    /**
     * {@inheritDoc}
     */
    public List<Inventory> executeOrder(OrderForm orderForm) throws Exception {
        inventoryDao.purchaseItem(inventoryDao.getInventory(1), orderForm.getItemACount());
        inventoryDao.purchaseItem(inventoryDao.getInventory(2), orderForm.getItemBCount());
        return inventoryDao.getInventoryList();
    }

    @Override
    public void reset() {
        if(inventoryDao instanceof InventoryDaoImpl) {
            // reset app values.
            ((InventoryDaoImpl) inventoryDao).reset();
        }
    }
}
