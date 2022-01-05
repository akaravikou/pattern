package com.solvd.pattern.factory;

public class Enduro implements Motorcycle {

    @Override
    public void getPayment() {
        System.out.println("Enduro price 20$ per day.");
    }
}
