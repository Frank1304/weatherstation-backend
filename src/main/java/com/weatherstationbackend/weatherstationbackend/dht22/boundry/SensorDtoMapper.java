package com.weatherstationbackend.weatherstationbackend.dht22.boundry;

import com.weatherstationbackend.weatherstationbackend.dht22.control.Sensor;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SensorDtoMapper {
    SensorDto map(Sensor sensor);
    Sensor map(SensorDto sensor);
}
