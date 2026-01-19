package com.collection.ScenarioBased.ImplementShoppingCart;
//Main shopping cart controller
class ShoppingCart {

 private ProductPriceStore priceStore = new ProductPriceStore();
 private CartOrderTracker orderTracker = new CartOrderTracker();
 private SortedPriceDisplay sortedDisplay = new SortedPriceDisplay();

 // Add product to system
 void addProduct(String name, int price) {
     priceStore.addProduct(name, price);
 }

 // Add product to cart
 void addToCart(String product) {
     int price = priceStore.getPrice(product);
     orderTracker.addItem(product, price);
 }

 // Show cart details
 void showCartDetails() {
     orderTracker.displayCart();
     sortedDisplay.displaySortedByPrice(orderTracker.getCartItems());
 }
}
