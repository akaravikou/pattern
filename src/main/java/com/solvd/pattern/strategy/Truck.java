package com.solvd.pattern.strategy;

public class Truck implements Transport {

    @Override
    public void go() {
        System.out.println("You drive Hennessey Mammoth 1000 TRX");
    }
}
