package org.mapstruct.itest.packageprivateaccessors;


import java.math.BigDecimal;

public class Car {

    private String make;
    private int numberOfSeats;
    private CarType type;
    private Engine engine;
    private BigDecimal weight;
    BigDecimal price;
    public String color;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    int getNumberOfSeats() {
        return numberOfSeats;
    }

    void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    BigDecimal getWeight() {
        return weight;
    }

    void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    enum Engine {
        INTERNAL_COMBUSTION, HYBRID, ELECTRIC;
    }
}


