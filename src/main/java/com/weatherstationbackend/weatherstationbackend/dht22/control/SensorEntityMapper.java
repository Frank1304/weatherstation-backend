package com.weatherstationbackend.weatherstationbackend.dht22.control;

import com.weatherstationbackend.weatherstationbackend.dht22.entity.SensorEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
interface SensorEntityMapper {
    SensorEntity map(Sensor sensor);
    Sensor map(SensorEntity sensor);
}
