package org.mapstruct.itest.packageprivateaccessors.dto;

import java.math.BigDecimal;

public class CarDtoBuilder {

    private String make;
    private int seatCount;
    private String type;
    private String engine;
    private BigDecimal weight;
    private BigDecimal price;
    private String color;

    public CarDtoBuilder make(String make) {
        this.make = make;
        return this;
    }

    public CarDtoBuilder seatCount(int seatCount) {
        this.seatCount = seatCount;
        return this;
    }

    public CarDtoBuilder type(String type) {
        this.type = type;
        return this;
    }

    public CarDtoBuilder engine(String engine) {
        this.engine = engine;
        return this;
    }

    public CarDtoBuilder weight(BigDecimal weight) {
        this.weight = weight;
        return this;
    }

    public CarDtoBuilder price(BigDecimal price) {
        this.price = price;
        return this;
    }

    public CarDtoBuilder color(String color) {
        this.color = color;
        return this;
    }

    public CarDto build() {
        CarDto carDto = new CarDto();
        carDto.setMake( make );
        carDto.setSeatCount( seatCount );
        carDto.setType( type );
        carDto.setEngine( engine );
        carDto.setWeight( weight );
        carDto.price = price;
        carDto.color = color;
        return carDto;
    }
}
