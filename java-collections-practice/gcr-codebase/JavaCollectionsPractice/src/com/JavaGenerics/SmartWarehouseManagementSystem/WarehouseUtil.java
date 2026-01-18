package com.JavaGenerics.SmartWarehouseManagementSystem;

import java.util.List;

class WarehouseUtil {

    // Wildcard method: works with any WarehouseItem type
    public static void displayItems(List<? extends WarehouseItem> list) {

        for (WarehouseItem item : list) {
            System.out.println(
                item.getName() + " - " + item.getCategory()
            );
        }
    }
}
