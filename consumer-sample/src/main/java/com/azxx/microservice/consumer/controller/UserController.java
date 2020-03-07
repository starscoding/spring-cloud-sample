package com.azxx.microservice.consumer.controller;

import com.azxx.microservice.consumer.entity.User;
import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/movie")
@RestController
@Slf4j
public class UserController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        String url = "http://localhost:8080/user/1";
        User user = restTemplate.getForObject(url,User.class);
        log.info("user:{}",user);
        return user;
    }

}
