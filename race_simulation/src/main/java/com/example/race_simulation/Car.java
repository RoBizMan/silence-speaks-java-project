package com.example.race_simulation;

import java.util.Random;

public class Car extends Vehicle {
    private static final Random random = new Random();

    public Car(String name) {
        super(name, random.nextInt(41) + 90, random.nextDouble() * 2 + 4, random.nextInt(1451) + 1800);
    }
}
