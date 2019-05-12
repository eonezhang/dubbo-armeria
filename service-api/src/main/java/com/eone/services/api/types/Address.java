/*
 * Copyright 2018 MSParis Corporation
 */
package com.eone.services.api.types;

import java.io.Serializable;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 *
 * @author eonezhang 2019/5/11
 */
@Data
@Accessors(chain = true)
public class Address implements Serializable {
    public static Address of() {
        return new Address();
    }

    private String line1;
}
