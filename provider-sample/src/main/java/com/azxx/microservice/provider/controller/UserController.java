package com.azxx.microservice.provider.controller;

import com.azxx.microservice.provider.entity.User;
import com.azxx.microservice.provider.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return userRepository.findById(id);
    }
}
