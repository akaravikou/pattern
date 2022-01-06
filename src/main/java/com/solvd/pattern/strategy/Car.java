package com.solvd.pattern.strategy;

public class Car implements Transport {

    @Override
    public void go() {
        System.out.println("You drive Ferrari F40");
    }
}
