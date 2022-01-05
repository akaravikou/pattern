package com.solvd.pattern.factory;

public class MotoRentFactory {

    public Motorcycle getMoto(Type type) {
        Motorcycle motorcycle = null;
        switch (type) {
            case ENDURO:
                motorcycle = new Enduro();
                break;
            case CHOPPER:
                motorcycle = new Chopper();
                break;
            case CLASSIC:
                motorcycle = new Classic();
                break;
            case SPORT_BIKE:
                motorcycle = new SportBike();
                break;
            default:
                break;
        }
        return motorcycle;
    }
}
