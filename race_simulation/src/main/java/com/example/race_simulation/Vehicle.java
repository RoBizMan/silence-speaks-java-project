package com.example.race_simulation;

public abstract class Vehicle {
    protected String name;
    protected double speed; // km/h
    protected double acceleration; // m/s^2
    protected double weight; // kg

    public Vehicle(String name, double speed, double acceleration, double weight) {
        this.name = name;
        this.speed = speed;
        this.acceleration = acceleration;
        this.weight = weight;
    }

    public double raceTrack() {
        double distance = 2000; // m
        double realisticSpeed = speed * (1 - (weight / 10000));
        double time = distance / (realisticSpeed / 3.6); // s
        return time;
    }

    public String getName() {
        return name;
    }
}
