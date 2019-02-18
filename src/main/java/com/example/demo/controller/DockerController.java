package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DockerController {
	@Value("${CUST_ENV:notfound}")
    private String cust_env;
	@RequestMapping("/hello")
    public String index() {
        return "Hello Docker thtee! "+cust_env;
    }
}
