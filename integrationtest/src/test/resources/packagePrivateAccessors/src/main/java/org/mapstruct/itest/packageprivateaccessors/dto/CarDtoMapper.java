package org.mapstruct.itest.packageprivateaccessors.dto;

import org.mapstruct.itest.packageprivateaccessors.Car;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CarDtoMapper {

    CarDtoMapper INSTANCE = Mappers.getMapper( CarDtoMapper.class );

    @Mapping(target = "engine", ignore = true)
    Car carDtoToCar(CarDto carDto);

    CarDto cloneCarDto(CarDto carDto);
}
