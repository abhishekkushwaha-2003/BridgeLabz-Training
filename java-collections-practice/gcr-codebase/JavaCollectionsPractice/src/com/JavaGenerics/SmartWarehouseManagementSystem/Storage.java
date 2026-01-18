package com.JavaGenerics.SmartWarehouseManagementSystem;

import java.util.ArrayList;
import java.util.List;

// T must be WarehouseItem or its child
class Storage<T extends WarehouseItem> {

    private List<T> items = new ArrayList<>();

    // Add item to storage
    public void addItem(T item) {
        items.add(item);
    }

    // Get all items
    public List<T> getItems() {
        return items;
    }
}
