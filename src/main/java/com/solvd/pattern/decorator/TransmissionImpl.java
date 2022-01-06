package com.solvd.pattern.decorator;

public class TransmissionImpl implements Transmission {

    @Override
    public void gearUp() {
        System.out.println("Increased gear enabled");
    }

    @Override
    public void gearDown() {
        System.out.println("Reduced gear enabled");
    }
}
