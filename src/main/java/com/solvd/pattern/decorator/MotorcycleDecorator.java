package com.solvd.pattern.decorator;

public class MotorcycleDecorator implements Engine, Transmission {

    private final Engine engine;
    private final Transmission transmission;


    public MotorcycleDecorator(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }


    @Override
    public void start() {
        System.out.println("Oil level check");
        engine.start();
    }

    @Override
    public void finish() {
        engine.finish();
        System.out.println("Fuel pump shutdown");
    }

    @Override
    public void gearUp() {
        System.out.println("Select of transmission operation mode");
        transmission.gearUp();
    }

    @Override
    public void gearDown() {
        System.out.println("Clutch check");
        transmission.gearDown();
    }
}
