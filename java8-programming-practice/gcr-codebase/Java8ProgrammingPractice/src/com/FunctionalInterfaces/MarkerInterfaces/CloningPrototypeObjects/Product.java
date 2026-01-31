package com.FunctionalInterfaces.MarkerInterfaces.CloningPrototypeObjects;

public class Product implements Cloneable {

    int id;
    String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
        return (Product) super.clone();
    }
}