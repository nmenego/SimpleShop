package com.simpleshop.repository;

import com.simpleshop.entity.Inventory;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nmenego on 10/20/16.
 */
@Repository
public class InventoryDaoImpl implements InventoryDao {
    private static Inventory itemA;
    private static Inventory itemB;

    public InventoryDaoImpl() {
        reset();
    }

    // to reset the app..
    public void reset() {
        itemA = new Inventory(1, "Item A", 20);
        itemB = new Inventory(2, "Item B", 10);
    }

    /**
     * {@inheritDoc}
     */
    public List<Inventory> getInventoryList() {
        return Arrays.asList(itemA, itemB);
    }

    /**
     * {@inheritDoc}
     */
    public Inventory getInventory(int id) throws Exception {
        if(id == itemA.getItemId()) {
            return itemA;
        } else if(id == itemB.getItemId()) {
            return itemB;
        } else {
            throw new Exception("Item does not exist!");
        }
    }

    /**
     * {@inheritDoc}
     */
    public void purchaseItem(Inventory item, int count) throws Exception {

        if (checkCount(item.getCount(), count)) {
            checkOut(item, count);
        } else {
            throw new Exception("Not enough items on stock!");
        }
    }

    // checkout items
    private void checkOut(Inventory item, int count) {
        item.setCount(item.getCount() - count);
    }

    // check if items in stock is enough to fulfill order
    private boolean checkCount(int inStock, int count1) {

        return inStock >= count1 && count1 >= 0? true : false;
    }
}
