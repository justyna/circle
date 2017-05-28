package com.circle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ThinkPad on 21.05.2017.
 */
@RestController
public class HealthController {

    private final Logger logger = LoggerFactory.getLogger(HealthController.class);
    private final UsersRepository usersRepository;

    @Autowired
    public HealthController(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @RequestMapping("/users/health")
    public List<User> getUsers() {
        List<User> users = usersRepository.getUsers();
        return users;
    }

    @RequestMapping("/users/{id}/health")
    public User getUser(@PathVariable(name = "id") Integer id) {
        User user = usersRepository.getUser(id);
        return user;
    }


    @RequestMapping(value = "/users/health", method = RequestMethod.POST,
            consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
    public List<User> add(@RequestBody User user) {
        List<User> users = usersRepository.add(user);
        return users;
    }

}
