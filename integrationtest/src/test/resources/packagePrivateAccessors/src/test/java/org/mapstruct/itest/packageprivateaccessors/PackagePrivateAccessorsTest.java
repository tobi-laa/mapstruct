package org.mapstruct.itest.packageprivateaccessors;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;
import org.mapstruct.itest.packageprivateaccessors.dto.CarDto;
import org.mapstruct.itest.packageprivateaccessors.dto.CarDtoMapper;
import org.mapstruct.itest.packageprivateaccessors.dto.CarDtoBuilder;

import static org.assertj.core.api.Assertions.assertThat;

public class PackagePrivateAccessorsTest {

    private CarMapper mapper = CarMapper.INSTANCE;
    private CarDtoMapper dtoMapper = CarDtoMapper.INSTANCE;

    private Car givenCar;
    private CarDto givenCarDto;

    private Car actualCar;
    private CarDto actualCarDto;

    private Car expectedCar;
    private CarDto expectedCarDto;

    @Before
    public void resetTestData() {
        this.givenCar = null;
        this.givenCarDto = null;
    }

    @Test
    public void validCar_whenMappingToDto_shouldReturnExpectedDto() {
        givenValidCar();
        whenCallingCarToCarDto();
        thenExpectedCarDtoShouldBeReturned();
    }

    @Test
    public void validCarDto_whenMappingToCar_shouldReturnExpectedCar() {
        givenValidCarDto();
        whenCallingCarDtoToCar();
        thenExpectedCarShouldBeReturned();
    }

    @Test
    public void validCarDto_whenCloningDto_shouldReturnExpectedDto() {
        givenValidCarDto();
        whenCallingCloneCarDto();
        thenExpectedCarDtoShouldBeReturned();
    }

    private void givenValidCar() {
        this.givenCar = new CarBuilder()
            .make( "" )
            .numberOfSeats( 5 )
            .type( CarType.SEDAN )
            .engine( Car.Engine.ELECTRIC )
            .weight( BigDecimal.valueOf( 3 ) )
            .price( BigDecimal.TEN )
            .color( "red" )
            .build();
        //
        this.expectedCar = givenCar;
        //
        this.expectedCarDto = new CarDtoBuilder()
            .make( "" )
            .seatCount( 5 )
            .engine( "ELECTRIC" )
            .price( BigDecimal.TEN )
            .build();
    }

    private void givenValidCarDto() {
        this.givenCarDto = new CarDtoBuilder()
            .make( "" )
            .seatCount( 5 )
            .type( "SEDAN" )
            .engine( "ELECTRIC" )
            .weight( BigDecimal.valueOf( 3 ) )
            .price( BigDecimal.TEN )
            .color( "red" )
            .build();
        //
        this.expectedCarDto = givenCarDto;
        //
        this.expectedCar = new CarBuilder()
            .make( "" )
            .type( CarType.SEDAN )
            .engine( Car.Engine.ELECTRIC )
            .color( "red" )
            .build();
    }

    private void whenCallingCarToCarDto() {
        actualCarDto = mapper.carToCarDto( givenCar );
    }

    private void whenCallingCarDtoToCar() {
        actualCar = dtoMapper.carDtoToCar( givenCarDto );
    }

    private void whenCallingCloneCarDto() {
        actualCarDto = dtoMapper.cloneCarDto( givenCarDto );
    }

    private void thenExpectedCarShouldBeReturned() {
        assertThat( actualCar ).isEqualToComparingFieldByField( expectedCar );
    }

    private void thenExpectedCarDtoShouldBeReturned() {
        assertThat( actualCarDto ).isEqualToComparingFieldByField( expectedCarDto );
    }
}
