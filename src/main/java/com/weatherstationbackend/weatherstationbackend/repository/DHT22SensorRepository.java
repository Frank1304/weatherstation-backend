package com.weatherstationbackend.weatherstationbackend.repository;

import com.weatherstationbackend.weatherstationbackend.model.DHT22Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DHT22SensorRepository extends JpaRepository<DHT22Sensor, Long> {
}
