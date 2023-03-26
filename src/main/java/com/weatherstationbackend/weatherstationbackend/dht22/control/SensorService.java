package com.weatherstationbackend.weatherstationbackend.dht22.control;

import com.weatherstationbackend.weatherstationbackend.dht22.entity.SensorEntity;
import com.weatherstationbackend.weatherstationbackend.dht22.entity.SensorRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

import static java.util.stream.Collectors.toList;
import static java.util.stream.StreamSupport.stream;

@Service
@RequiredArgsConstructor
public class SensorService {
    private final SensorEntityMapper mapper;
    private final SensorRepository repo;

    @PostConstruct
    void init() {}

    public Collection<Sensor> findAll() {
        return stream(repo.findAll().spliterator(), false)
                .map(mapper::map)
                .collect(toList());
    }

    public Optional<Sensor> findById(long id) {
        return repo.findById(id).map(mapper::map);
    }

    public Optional<Sensor> getLatest() {
        return repo.findTopByOrderByIdDesc().map(mapper::map);
    }
}
