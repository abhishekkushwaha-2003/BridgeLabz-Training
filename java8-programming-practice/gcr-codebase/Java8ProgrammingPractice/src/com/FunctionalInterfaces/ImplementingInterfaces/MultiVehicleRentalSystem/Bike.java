package com.FunctionalInterfaces.ImplementingInterfaces.MultiVehicleRentalSystem;

public class Bike implements RentalVehicle {

    @Override
    public void rent() {
        System.out.println("Bike rented");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Bike returned");
    }
}
