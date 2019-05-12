/*
 * Copyright 2018 MSParis Corporation
 */
package com.eone.services.user.api;

import java.util.List;

import com.eone.services.api.types.Address;

/**
 * @author eonezhang 2019/5/11
 */
public interface UserService {
    List<Address> userAddress(Long userId);
}
