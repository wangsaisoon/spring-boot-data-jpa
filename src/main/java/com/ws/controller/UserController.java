package com.ws.controller;

import com.ws.bean.User;
import com.ws.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable("id") Integer id) {
        return userRepository.findById(id).get();
    }

    @PostMapping("/user")
    public User insertUser(User user) {
        User save = userRepository.save(user);
        return save;
    }
}
