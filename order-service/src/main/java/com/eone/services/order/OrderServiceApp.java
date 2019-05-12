/*
 * Copyright 2018 MSParis Corporation
 */
package com.eone.services.order;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 *
 * @author eonezhang 2019/5/12
 */
@SpringBootApplication
@ImportResource(value = { "dubbo.xml" })
public class OrderServiceApp implements CommandLineRunner {

    @Autowired
    OrderService orderService;

    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApp.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        orderService.initOrder("1");
    }
}
