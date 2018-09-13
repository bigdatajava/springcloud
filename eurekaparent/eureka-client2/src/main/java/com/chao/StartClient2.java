package com.chao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class StartClient2
{
    public static void main( String[] args )
    {

        SpringApplication.run(StartClient2.class,args);
    }
}

