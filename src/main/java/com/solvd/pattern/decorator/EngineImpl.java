package com.solvd.pattern.decorator;

public class EngineImpl implements Engine {

    @Override
    public void start() {
        System.out.println("Engine is starting");
    }

    @Override
    public void finish() {
        System.out.println("Engine off");
    }
}
