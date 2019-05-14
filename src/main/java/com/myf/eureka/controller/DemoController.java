package com.myf.eureka.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by maoyf0503 on 2019-5-14.
 *
 * @author maoyf0503
 */
@RestController
public class DemoController {
    @GetMapping("/test")
    public String test(){
        return "test ok";
    }
}
