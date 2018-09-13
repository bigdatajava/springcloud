package com.chao.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/ribbon")
    public String queryRibbon(){

        String forObject = this.restTemplate.getForObject("http://eureka-client1:2001/eureka-instance", String.class);
        return forObject;

    }

}
