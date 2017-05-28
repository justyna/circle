package com.circle;

import com.codahale.metrics.MetricRegistry;
import com.codahale.metrics.Timer;
import com.codahale.metrics.annotation.Timed;
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
    private final MetricRegistry metricRegistry;



    @Autowired
    public HealthController(UsersRepository usersRepository, MetricRegistry metricRegistry) {
        this.usersRepository = usersRepository;
        this.metricRegistry = metricRegistry;
    }
     private static final Logger log = LoggerFactory.getLogger(HealthController.class);

    @RequestMapping("/users/health")
    @Timed(absolute = true, name = "getUsers")
    public List<User> getUsers() throws InterruptedException {
            List<User> users = usersRepository.getUsersWithRandomTime();
            return users;
    }

    @RequestMapping("/users/{id}/health")
    @Timed(absolute = true, name = "getUser")
    public User getUser(@PathVariable(name = "id") Integer id) {
        User user = usersRepository.getUser(id);
        return user;
    }


    @RequestMapping(value = "/users/health", method = RequestMethod.POST,
            consumes = "application/json; charset=UTF-8", produces = "application/json; charset=UTF-8")
    @Timed(absolute = true, name = "add")
    public List<User> add(@RequestBody User user) {
        List<User> users = usersRepository.add(user);
        return users;
    }

}
