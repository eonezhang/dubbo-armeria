/*
 * Copyright 2018 MSParis Corporation
 */
package com.eone.services.order;

import java.util.List;

import org.springframework.stereotype.Component;

import com.eone.services.api.types.Address;
import com.eone.services.user.api.UserService;

/**
 *
 * @author eonezhang 2019/5/12
 */
@Component
public class OrderServiceImpl implements OrderService {
    final UserService userService;

    public OrderServiceImpl(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void initOrder(String userId) {
        List<Address> userAddresses = userService.userAddress(1l);
        userAddresses.forEach(address -> System.out.printf("%s\n", address));
    }
}
