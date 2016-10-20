package com.simpleshop.model;

/**
 * Created by nmenego on 10/20/16.
 */
public class Inventory {
    private int itemId;
    private String itemName;
    private int count;

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
