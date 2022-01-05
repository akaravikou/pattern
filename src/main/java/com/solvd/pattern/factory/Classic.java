package com.solvd.pattern.factory;

public class Classic implements Motorcycle {

    @Override
    public void getPayment() {
        System.out.println("Classic bike price 10$ per day.");
    }
}
