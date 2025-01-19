package com.example.race_simulation;

import java.util.Random;

public class Truck extends Vehicle {
    private static final Random random = new Random();

    public Truck(String name) {
        super(name, random.nextInt(41) + 60, random.nextDouble() * 2 + 2, random.nextInt(5151) + 4225);
    }
}
