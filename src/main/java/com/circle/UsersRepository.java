package com.circle;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ThinkPad on 22.05.2017.
 */
@Component
public class UsersRepository {


    private List<User> users = new ArrayList<>();


    public UsersRepository() {
        HealthStatus healthStatus1 = new HealthStatus(36.6, 45.7, 78.9, 108.9);
        HealthStatus healthStatus2 = new HealthStatus(37.5, 145.7, 33.9, 15.9);
        HealthStatus healthStatus3 = new HealthStatus(36.6, 67.34, 22.34, 12.99);
        HealthStatus healthStatus4 = new HealthStatus(39.0, 34.56, 33.9, 67.9);
        HealthStatus healthStatus5 = new HealthStatus(35.9, 34.56, 33.9, 67.9);

        users.add(new User(1, "Anna", "Maria", healthStatus1));
        users.add(new User(2, "Tom", "Hardy", healthStatus2));
        users.add(new User(3, "Perpetua", "Mug", healthStatus3));
        users.add(new User(4, "George", "Wood", healthStatus4));
        users.add(new User(5, "Joan", "Hardy", healthStatus5));

    }

    public List<User> getUsers() {
        return users;
    }

    public User getUser(Integer id) {
        return users.get(id);
    }

    public List<User> add(User user) {
        this.users.add(user);
        return this.users;
    }

}
