package org.mapstruct.itest.packageprivateaccessors.dto;

import java.math.BigDecimal;

public class CarDto {

    private String make;
    private int seatCount;
    private String type;
    private String engine;
    private BigDecimal weight;
    public BigDecimal price;
    String color;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    String getType() {
        return type;
    }

    void setType(String type) {
        this.type = type;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    BigDecimal getWeight() {
        return weight;
    }

    void setWeight(BigDecimal weight) {
        this.weight = weight;
    }
}

