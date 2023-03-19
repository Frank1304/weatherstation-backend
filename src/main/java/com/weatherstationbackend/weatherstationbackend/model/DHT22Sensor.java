package com.weatherstationbackend.weatherstationbackend.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "dht22")
public class DHT22Sensor {

    private long id;
    private String timestamp;
    private double humidity;
    private double temperature;

    public DHT22Sensor() {}

    public DHT22Sensor(String timestamp, double humidity, double temperature) {
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

    @Column(name = "timestamp", nullable = false)
    public String getTimestamp() {
        return timestamp;
    }

    @Column(name = "humidity", nullable = false)
    public double getHumidity() {
        return humidity;
    }

    @Column(name = "temperature", nullable = false)
    public double getTemperature() {
        return temperature;
    }
}