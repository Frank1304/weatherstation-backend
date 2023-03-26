package com.weatherstationbackend.weatherstationbackend.dht22.control;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sensor {
    private Long id;
    private LocalDateTime timestamp;
    private double humidity;
    private double temperature;
}
