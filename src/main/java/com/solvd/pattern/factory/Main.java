package com.solvd.pattern.factory;

public class Main {

    public static void main(String[] args) {
        MotoRentFactory motoRentFactory = new MotoRentFactory();
        MotoRent motoRent = new MotoRent(motoRentFactory);
        motoRent.getBike(Type.CHOPPER);
    }
}

/*
 Factory - это паттерн проектирования, который помогает решить проблему создания различных объектов в зависимости от
некоторых условий. В данном случаем в сервисе аренды мотоциклов мы определяем какого типа мотоцикл берем в аренду и
узнаем стоимость аренды в сутки.
*/
