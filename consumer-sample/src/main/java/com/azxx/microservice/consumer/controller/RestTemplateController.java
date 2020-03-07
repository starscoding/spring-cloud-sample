package com.azxx.microservice.consumer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

/**
 * <p>
 * RestTemplate 示例
 * </p>
 *
 * @author xuzheng
 * @since 2020/3/4 21:41
 */

@RestController
@RequestMapping("/restTemplate")
public class RestTemplateController {

    private RestTemplate restTemplate;

    @GetMapping("/get/{id}")
    public String get(@PathVariable Long id){

        String url = "http://localhost:8080/user/1";
        ResponseEntity result = restTemplate.getForEntity(url,String.class);
        return null;
    }
}
