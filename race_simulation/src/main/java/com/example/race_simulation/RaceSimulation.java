package com.example.race_simulation;

import java.util.HashMap;
import java.util.Map;

public class RaceSimulation {
    public static Map<String, Double> simulateRace() {
        Motorcycle motorcycle = new Motorcycle("Jawa Moto");
        Car car = new Car("Skoda Fabia");
        Truck truck = new Truck("Tatra 138");

        Vehicle[] vehicles = {motorcycle, car, truck};

        Map<String, Double> times = new HashMap<>();
        for (Vehicle vehicle : vehicles) {
            times.put(vehicle.getName(), vehicle.raceTrack());
        }

        return times;
    }

    public static String formatTime(double seconds) {
        int minutes = (int) seconds / 60;
        double remainingSeconds = seconds % 60;
        return String.format("%dm %.2fs", minutes, remainingSeconds);
    }
}