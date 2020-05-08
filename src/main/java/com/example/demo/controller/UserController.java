package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "{id}")
    public User selectById(@PathVariable("id") int id) {
        return userService.selectUserById(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addPerson(user);
    }

    @DeleteMapping
    public void removeUser(@RequestBody User user) {
        userService.removeUser(user);
    }

    @PutMapping
    public void updateUser(@RequestBody User user) {
        userService.updateUser(user);
    }
}
