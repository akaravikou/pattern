package com.solvd.pattern.factory;

public class SportBike implements Motorcycle {

    @Override
    public void getPayment() {
        System.out.println("Sport bike price 25$ per day.");
    }
}
