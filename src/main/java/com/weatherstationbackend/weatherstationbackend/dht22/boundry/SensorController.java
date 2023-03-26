package com.weatherstationbackend.weatherstationbackend.dht22.boundry;

import com.weatherstationbackend.weatherstationbackend.dht22.control.SensorService;
import com.weatherstationbackend.weatherstationbackend.shared.boundry.OnUpdate;
import com.weatherstationbackend.weatherstationbackend.shared.exception.ResourceNotFoundException;
import com.weatherstationbackend.weatherstationbackend.dht22.entity.SensorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/dht22")
@RequiredArgsConstructor
public class SensorController {
    private static final String DEFAULT_MEDIA_TYPE = MediaType.APPLICATION_JSON_VALUE;
    private final SensorService service;
    private final SensorDtoMapper mapper;

    @GetMapping(produces = DEFAULT_MEDIA_TYPE)
    public Collection<SensorDto> findAll() throws ResourceNotFoundException {
        Collection<SensorDto> sensorData = service
                .findAll()
                .stream()
                .map(mapper::map)
                .collect(Collectors.toList());

        if (sensorData.isEmpty()) {
            throw new ResourceNotFoundException("No sensor data found.");
        }

        return sensorData;
    }

    @GetMapping(value = "/latest", produces = DEFAULT_MEDIA_TYPE)
    public SensorDto getLatestSensorData() throws ResourceNotFoundException {
        return service
                .getLatest()
                .map(mapper::map)
                .orElseThrow(() -> new ResourceNotFoundException("No sensor data found"));
    }

    @GetMapping(value = "/{id}", produces = DEFAULT_MEDIA_TYPE)
    public SensorDto findById(@Validated(OnUpdate.class) final @PathVariable(value = "id") Long id) throws ResourceNotFoundException {
        return service
                .findById(id)
                .map(mapper::map)
                .orElseThrow(() -> new ResourceNotFoundException("Sensor data not found for this id:: " +id));


    }
}
