package com.simpleshop.entity;

/**
 * Entity to represent our Inventory.
 */
public class Inventory {
    private int itemId;
    private String itemName;
    private int count;

    public Inventory() {
    }

    public Inventory(int itemId, String itemName, int count) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.count = count;
    }

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
