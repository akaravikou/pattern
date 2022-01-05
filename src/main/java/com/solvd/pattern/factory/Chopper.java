package com.solvd.pattern.factory;

public class Chopper implements Motorcycle {

    @Override
    public void getPayment() {
        System.out.println("Chopper price 15$ per day.");
    }
}
