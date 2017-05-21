package com.circle;

/**
 * Created by ThinkPad on 21.05.2017.
 */
public class HealthStatus {
    private final double bodyTemperature;
    private final double pulseRate;
    private final double respirationRate;
    private final double bloodPressure;

    public HealthStatus(double bodyTemperature, double pulseRate, double respirationRate, double bloodPressure) {
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
