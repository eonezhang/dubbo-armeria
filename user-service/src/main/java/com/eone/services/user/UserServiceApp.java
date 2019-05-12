/*
 * Copyright 2018 MSParis Corporation
 */
package com.eone.services.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author eonezhang 2019/5/11
 */
@SpringBootApplication
@ImportResource("dubbo.xml")
public class UserServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceApp.class, args);
    }
}
