package com.FunctionalInterfaces.ImplementingInterfaces.MultiVehicleRentalSystem;

public class VehicleRentalSystem {
    public static void main(String[] args) {

        RentalVehicle v1 = new Car();
        RentalVehicle v2 = new Bike();

        v1.rent();
        v2.returnVehicle();
    }
}
