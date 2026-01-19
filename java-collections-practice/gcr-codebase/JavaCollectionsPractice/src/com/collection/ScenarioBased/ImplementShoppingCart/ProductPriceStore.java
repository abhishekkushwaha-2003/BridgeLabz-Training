package com.collection.ScenarioBased.ImplementShoppingCart;

import java.util.HashMap;
import java.util.Map;

// This class stores product prices
class ProductPriceStore {

    private Map<String, Integer> priceMap = new HashMap<>();

    // Add product price
    void addProduct(String product, int price) {
        priceMap.put(product, price);
    }

    // Get price of a product
    int getPrice(String product) {
        return priceMap.get(product);
    }

    // Return all prices
    Map<String, Integer> getAllPrices() {
        return priceMap;
    }
}
