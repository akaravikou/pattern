package com.solvd.pattern.strategy;

public class Motorcycle implements Transport {

    @Override
    public void go() {
        System.out.println("You ride on Ducati Panigale");
    }
}
