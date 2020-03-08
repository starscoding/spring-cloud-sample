package com.azxx.microservice.consumer.controller;

import com.azxx.microservice.consumer.entity.User;
import com.azxx.microservice.consumer.feign.UserFeignClient;
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

    @Autowired
    private UserFeignClient userFeignClient;


    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id){
        String url = "http://127.0.0.1:8080/user/1";
        User user = restTemplate.getForObject(url,User.class);
        log.info("user:{}",user);
        return user;
    }

    @GetMapping("/ribbon/user/{id}")
    public User findById2(@PathVariable Long id){
        String url = "http://provider/user/1";
        User user = restTemplate.getForObject(url,User.class);
        log.info("user:{}",user);
        return user;
    }

    @GetMapping("/feign/user/{id}")
    public User findByIdFeign(@PathVariable Long id){
        User user = userFeignClient.findById(id);
        log.info("feign user:{}",user);
        return user;
    }

}
