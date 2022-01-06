package com.solvd.pattern.strategy;

public class Rider {

    private String name;
    private int level;
    private Transport transport;

    public Rider(String name) {
        this.name = name;
        this.level = 0;
        this.transport = new Motorcycle();
    }

    public void ride() {
        transport.go();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }
}
