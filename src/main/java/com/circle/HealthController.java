package com.circle;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ThinkPad on 21.05.2017.
 */
@RestController
public class HealthController {

    HealthStatus healthStatus1 = new HealthStatus(36.6, 45.7, 78.9, 108.9);
    HealthStatus healthStatus2 = new HealthStatus(37.5, 145.7, 33.9, 15.9);
    HealthStatus healthStatus3 = new HealthStatus(36.6, 67.34, 22.34, 12.99);
    HealthStatus healthStatus4 = new HealthStatus(39.0, 34.56, 33.9, 67.9);
    HealthStatus healthStatus5 = new HealthStatus(36.6, 135.7, 56.5, 115.71);

    List<User> users = Arrays.asList(
            new User(1, "Anna", "Maria", healthStatus1),
            new User(2, "Tom", "Hardy", healthStatus2),
            new User(1, "Perpetua", "Mug", healthStatus3),
            new User(2, "George", "Wood", healthStatus4),
            new User(2, "Joan", "Hardy", healthStatus5)
    );
    @RequestMapping("/users/health")
    public List<User> getUsers() {


        return users;
    }

    @RequestMapping("/users/{id}/health")
    public User getUser(@PathVariable(name = "id") Integer id) {
        return users.get(id);
    }


}
