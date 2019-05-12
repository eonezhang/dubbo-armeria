/*
 * Copyright 2018 MSParis Corporation
 */
package com.eone.services.user;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.eone.services.api.types.Address;
import com.eone.services.user.api.UserService;

/**
 *
 * @author eonezhang 2019/5/11
 */
@Component(value = "userService")
public class UserServiceImpl implements UserService {
    public List<Address> userAddress(Long userId) {
        return Arrays.asList(Address.of().setLine1("line1 123"),
                             Address.of().setLine1("line1 234"));
    }
}
