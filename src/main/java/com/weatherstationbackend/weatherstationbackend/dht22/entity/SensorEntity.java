package com.weatherstationbackend.weatherstationbackend.dht22.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Entity(name="sensor")
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name = "dht22")
public class SensorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp;
    @Column(name = "humidity", nullable = false)
    private double humidity;

    @Column(name = "temperature", nullable = false)
    private double temperature;


    public SensorEntity(long id, LocalDateTime timestamp, double humidity, double temperature) {
        this.id = id;
        this.timestamp = timestamp;
        this.humidity = humidity;
        this.temperature = temperature;
    }
}