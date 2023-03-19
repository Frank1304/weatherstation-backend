package com.weatherstationbackend.weatherstationbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

@Entity
@Table(name = "dht22")
public class DHT22SensorData {

    private long id;
    private LocalDateTime timestamp;
    private double humidity;
    private double temperature;

    public DHT22SensorData() {}

    public DHT22SensorData(LocalDateTime timestamp, double humidity, double temperature) {
        this.timestamp = timestamp;
        this.humidity = humidity;
        this.temperature = temperature;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "timestamp", columnDefinition = "TIMESTAMP", nullable = false)
    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestmap){
        this.timestamp = timestmap;
    }

    @Column(name = "humidity", nullable = false)
    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    @Column(name = "temperature", nullable = false)
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
}