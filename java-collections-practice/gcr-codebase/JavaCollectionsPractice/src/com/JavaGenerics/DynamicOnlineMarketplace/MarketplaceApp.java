package com.JavaGenerics.DynamicOnlineMarketplace;

import java.util.ArrayList;
import java.util.List;

class MarketplaceApp {

    public static void main(String[] args) {

        // Product catalog (different product types together)
        List<Product<?>> catalog = new ArrayList<>();

        // Create products
        Product<BookCategory> book =
                new Product<>("Java Basics", 500, new BookCategory());

        Product<ClothingCategory> shirt =
                new Product<>("T-Shirt", 800, new ClothingCategory());

        Product<GadgetCategory> phone =
                new Product<>("Smart Phone", 15000, new GadgetCategory());

        // Add to catalog
        catalog.add(book);
        catalog.add(shirt);
        catalog.add(phone);

        // Apply discount
        DiscountUtil.applyDiscount(book, 10);
        DiscountUtil.applyDiscount(shirt, 20);
        DiscountUtil.applyDiscount(phone, 5);

        // Display catalog
        for (Product<?> p : catalog) {
            System.out.println(
                p.getName() + " | " +
                p.getCategory().getCategoryName() + " | Price: " +
                p.getPrice()
            );
        }
    }
}
