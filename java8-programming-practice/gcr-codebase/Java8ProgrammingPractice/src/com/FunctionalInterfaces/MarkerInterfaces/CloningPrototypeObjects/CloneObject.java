package com.FunctionalInterfaces.MarkerInterfaces.CloningPrototypeObjects;

public class CloneObject {
    public static void main(String[] args) throws Exception {

        Product p1 = new Product(1, "Laptop");
        Product p2 = (Product) p1.clone();

        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
