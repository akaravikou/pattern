package com.solvd.pattern.builder;

public class Motorcycle {

    private String brand;
    private String model;
    private int engineCapacity;
    private int releaseYear;
    private String condition;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getCondition() {
        return condition;
    }

    public static Builder builder() {
        return new Builder(new Motorcycle());
    }

    public static class Builder {

        private final Motorcycle motorcycle;

        private Builder(Motorcycle motorcycle) {
            this.motorcycle = motorcycle;
        }

        public Builder brand(String brand) {
            motorcycle.brand = brand;
            return this;
        }

        public Builder model(String model) {
            motorcycle.model = model;
            return this;
        }

        public Builder engineCapacity(int engineCapacity) {
            motorcycle.engineCapacity = engineCapacity;
            return this;
        }

        public Builder releaseYear(int releaseYear) {
            motorcycle.releaseYear = releaseYear;
            return this;
        }

        public Builder condition(String condition) {
            motorcycle.condition = condition;
            return this;
        }

        public Motorcycle build() {
            return motorcycle;
        }
    }
}
