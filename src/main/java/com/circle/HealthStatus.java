package com.circle;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ThinkPad on 21.05.2017.
 */
public class HealthStatus {
    private final double bodyTemperature;
    private final double pulseRate;
    private final double respirationRate;
    private final double bloodPressure;

    @JsonCreator
    public HealthStatus(
            @JsonProperty("bodyTemperature") double bodyTemperature, @JsonProperty("pulseRate") double pulseRate,
            @JsonProperty("respirationRate") double respirationRate, @JsonProperty("bloodPressure") double bloodPressure) {
        this.bodyTemperature = bodyTemperature;
        this.pulseRate = pulseRate;
        this.respirationRate = respirationRate;
        this.bloodPressure = bloodPressure;
    }

    public double getBodyTemperature() {
        return bodyTemperature;
    }

    public double getPulseRate() {
        return pulseRate;
    }

    public double getRespirationRate() {
        return respirationRate;
    }

    public double getBloodPressure() {
        return bloodPressure;
    }
}
