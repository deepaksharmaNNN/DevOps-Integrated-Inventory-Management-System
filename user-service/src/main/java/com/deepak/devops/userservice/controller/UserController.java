package com.deepak.devops.userservice.controller;

import com.deepak.devops.userservice.entity.User;
import com.deepak.devops.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {
    /**
     * The UserService instance to handle user-related operations.
     */
    private final UserService userService;

    /**
     * A simple endpoint to check if the user service is running.
     *
     * @return a message indicating the service is up and running.
     */
    @GetMapping("/hello")
    public String hello() {
        return "User Service is up and running!";
    }

    /**
     * Endpoint to retrieve all users.
     *
     * @return a list of all users.
     */
    @GetMapping
    public List<User> getUsers() {
        return userService.getAllUsers();
    }

    /**
     * Endpoint to add a new user.
     *
     * @param user the user object to be added.
     * @return the saved user object.
     */
    @PostMapping
    public User addUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
}
