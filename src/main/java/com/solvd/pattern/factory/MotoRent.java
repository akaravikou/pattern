package com.solvd.pattern.factory;

public class MotoRent {

    private final MotoRentFactory motoRentFactory;

    public MotoRent(MotoRentFactory motoRentFactory) {
        this.motoRentFactory = motoRentFactory;
    }

    public Motorcycle getBike(Type type) {
        Motorcycle motorcycle = motoRentFactory.getMoto(type);
        motorcycle.getPayment();

        System.out.println("Have a good ride!");
        return motorcycle;
    }
}
