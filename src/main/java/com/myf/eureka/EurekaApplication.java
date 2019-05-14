package com.myf.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by maoyf0503 on 2019-5-14.
 *
 * @author maoyf0503
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[]args){
        SpringApplication.run(EurekaApplication.class,args);
    }
}
