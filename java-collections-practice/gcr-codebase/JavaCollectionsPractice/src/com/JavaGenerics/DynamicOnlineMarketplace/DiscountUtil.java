package com.JavaGenerics.DynamicOnlineMarketplace;

// create a DiscountUntill class
class DiscountUtil {

    // Generic method with bounded type
    public static <T extends Product<?>> void applyDiscount(
            T product, double percentage) {

        double discountAmount =
                product.getPrice() * (percentage / 100);

        double finalPrice =
                product.getPrice() - discountAmount;

        product.setPrice(finalPrice);
    }
}
