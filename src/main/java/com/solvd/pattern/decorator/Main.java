package com.solvd.pattern.decorator;

public class Main {

    public static void main(String[] args) {
        EngineImpl engine = new EngineImpl();
        TransmissionImpl transmission = new TransmissionImpl();
        MotorcycleDecorator motorcycleDecorator = new MotorcycleDecorator(engine, transmission);

        motorcycleDecorator.start();
        motorcycleDecorator.gearUp();
        motorcycleDecorator.gearDown();
        motorcycleDecorator.finish();
    }
}

/*
 Decorator представляет паттерн проектирования, который позволяет динамически подключать к объекту
дополнительную функциональность.
 В данном случаем мы добавляем новую функциональность в классе MotorcycleDecorator.
 */