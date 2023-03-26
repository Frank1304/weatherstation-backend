package com.weatherstationbackend.weatherstationbackend.dht22.boundry;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.weatherstationbackend.weatherstationbackend.shared.boundry.OnCreate;
import com.weatherstationbackend.weatherstationbackend.shared.boundry.OnUpdate;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Null;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SensorDto {
    @NotNull(groups= OnUpdate.class)
    @Null(groups=OnCreate.class)
    @JsonProperty("id")
    private Long id;
    @NotNull
    private LocalDateTime timestamp;
    @NotNull
    private double humidity;
    @NotNull
    private double temperature;
}
