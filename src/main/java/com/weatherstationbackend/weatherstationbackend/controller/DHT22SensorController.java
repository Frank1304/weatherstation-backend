package com.weatherstationbackend.weatherstationbackend.controller;


import com.weatherstationbackend.weatherstationbackend.model.DHT22Sensor;
import com.weatherstationbackend.weatherstationbackend.repository.DHT22SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DHT22SensorController {

    @Autowired
    private DHT22SensorRepository dht22SensorRepository;

    @GetMapping("/dht22")
    public List<DHT22Sensor> getAllSensorData() {
        return dht22SensorRepository.findAll();
    }
}
