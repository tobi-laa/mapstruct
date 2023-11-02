package org.mapstruct.itest.packageprivateaccessors;

import java.math.BigDecimal;

public class CarBuilder {

    private String make;
    private int numberOfSeats;
    private CarType type;
    private Car.Engine engine;
    private BigDecimal weight;
    public BigDecimal price;
    public String color;

    public CarBuilder make(String make) {
        this.make = make;
        return this;
    }

    public CarBuilder numberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
        return this;
    }

    public CarBuilder type(CarType type) {
        this.type = type;
        return this;
    }

    public CarBuilder engine(Car.Engine engine) {
        this.engine = engine;
        return this;
    }

    public CarBuilder weight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    public CarBuilder price(BigDecimal price) {
        this.price = price;
        return this;
    }

    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }

    public Car build() {
        Car car = new Car();
        car.setMake( make );
        car.setNumberOfSeats( numberOfSeats );
        car.setType( type );
        car.setEngine( engine );
        car.setWeight( weight );
        car.price = price;
        car.color = color;
        return car;
    }
}
