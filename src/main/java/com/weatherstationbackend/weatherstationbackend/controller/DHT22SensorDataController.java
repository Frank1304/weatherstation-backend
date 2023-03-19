package com.weatherstationbackend.weatherstationbackend.controller;


import com.weatherstationbackend.weatherstationbackend.exception.ResourceNotFoundException;
import com.weatherstationbackend.weatherstationbackend.model.DHT22SensorData;
import com.weatherstationbackend.weatherstationbackend.repository.DHT22SensorDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class DHT22SensorDataController {

    @Autowired
    private DHT22SensorDataRepository dht22SensorDataRepository;

    @GetMapping("/dht22")
    public List<DHT22SensorData> getAllSensorData() {
        return dht22SensorDataRepository.findAll();
    }

    @GetMapping("/dht22/{id}")
    public ResponseEntity<DHT22SensorData> getSensorDataById(@PathVariable(value = "id") Long id)
            throws ResourceNotFoundException {

        DHT22SensorData sensorData = dht22SensorDataRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("SensorData not found for this id :: " + id));

        return ResponseEntity.ok().body(sensorData);
    }
}
