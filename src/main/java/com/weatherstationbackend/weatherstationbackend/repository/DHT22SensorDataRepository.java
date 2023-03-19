package com.weatherstationbackend.weatherstationbackend.repository;

import com.weatherstationbackend.weatherstationbackend.model.DHT22SensorData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DHT22SensorDataRepository extends JpaRepository<DHT22SensorData, Long> {
}
