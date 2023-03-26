package com.weatherstationbackend.weatherstationbackend.dht22.entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface SensorRepository extends CrudRepository<SensorEntity, Long> {
    Optional<SensorEntity> findTopByOrderByIdDesc();
}

