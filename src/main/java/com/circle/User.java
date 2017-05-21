package com.circle;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ThinkPad on 21.05.2017.
 */
public class User {
    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final HealthStatus healthStatus;


    @JsonCreator
    public User(
            @JsonProperty("id") Integer id, @JsonProperty("firstName") String firstName,
            @JsonProperty("lastName") String lastName, @JsonProperty("healthStatus") HealthStatus healthStatus) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.healthStatus = healthStatus;
    }

    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public HealthStatus getHealthStatus() {
        return healthStatus;
    }

    public String getLastName() {

        return lastName;
    }
}
