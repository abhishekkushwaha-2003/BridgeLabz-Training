package com.FutureLogistics;

import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Goods Transport details:");
        String input = sc.nextLine();

        Utility utility = new Utility();
        GoodsTransport transport = utility.parseDetails(input);

        if (transport == null)
            return;

        System.out.println("Transporter id : " + transport.getTransportId());
        System.out.println("Date of transport : " + transport.getTransportDate());
        System.out.println("Rating of the transport : " + transport.getTransportRating());

        if (transport instanceof BrickTransport) {
            BrickTransport b = (BrickTransport) transport;
            System.out.println("Quantity of bricks : " + b.getBrickQuantity());
            System.out.println("Brick price : " + b.getBrickPrice());
        } else {
            TimberTransport t = (TimberTransport) transport;
            System.out.println("Type of the timber : " + t.getTimberType());
            System.out.println("Timber price per kilo : " + t.getTimberPrice());
        }

        System.out.println("Vehicle for transport : " + transport.vehicleSelection());
        System.out.println("Total charge : " + transport.calculateTotalCharge());
    }
}
