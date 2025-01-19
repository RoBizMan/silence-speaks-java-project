package race_simulation.src.main.java.com.example.race_simulation;

import java.util.Random;

public class Motorcycle extends Vehicle {
    private static final Random random = new Random();

    public Motorcycle(String name) {
        super(name, random.nextInt(31) + 70, random.nextDouble() * 4 + 6, random.nextInt(201) + 200);
    }
}
