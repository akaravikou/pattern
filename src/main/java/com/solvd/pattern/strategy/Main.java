package com.solvd.pattern.strategy;

public class Main {

    public static void main(String[] args) {
        Rider rider = new Rider("Oliver");
        rider.ride();
        rider.setTransport(new Car());
        rider.ride();
        rider.setTransport(new Truck());
        rider.ride();
    }
}

/*
 Паттерн Strategy определяет семейство алгоритмов, инкапсулирует каждый из них и обеспечивает их взаимозаменяемость.
Он позволяет модифицировать алгоритмы независимо от их использования на стороне клиента.
 В данном случае мы используем различные виды транспорта для передвижения.
*/

