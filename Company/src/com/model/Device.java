package com.model;

import java.util.UUID;

public class Device {
    private final String id = UUID.randomUUID().toString();
    private String model;

    public Device(String model) {
        this.model = model;
    }
}
