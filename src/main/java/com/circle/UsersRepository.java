package com.circle;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Arrays;
import java.util.List;

/**
 * Created by ThinkPad on 22.05.2017.
 */
@Component
public class UsersRepository {
   private HealthStatus healthStatus1 = new HealthStatus(36.6, 45.7, 78.9, 108.9);
   private HealthStatus healthStatus2 = new HealthStatus(37.5, 145.7, 33.9, 15.9);
   private HealthStatus healthStatus3 = new HealthStatus(36.6, 67.34, 22.34, 12.99);
   private HealthStatus healthStatus4 = new HealthStatus(39.0, 34.56, 33.9, 67.9);
   private HealthStatus healthStatus5 = new HealthStatus(36.6, 135.7, 56.5, 115.71);

    List<User> users = Arrays.asList(
            new User(1, "Anna", "Maria", healthStatus1),
            new User(2, "Tom", "Hardy", healthStatus2),
            new User(1, "Perpetua", "Mug", healthStatus3),
            new User(2, "George", "Wood", healthStatus4),
            new User(2, "Joan", "Hardy", healthStatus5)
    );

    public List<User> getUsers() {
        return users;
    }

    public User getUser(Integer id) {
        return users.get(id);
    }

    public List<User> add(User user) {
        users.add(user);
        return users;
    }

}
