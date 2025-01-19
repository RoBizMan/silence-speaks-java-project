package com.example.race_simulation;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;

public class StartRaceTest {

    @Test
    public void testSimulateRace() {
        Map<String, Double> times = RaceSimulation.simulateRace();
        assertNotNull(times);
        assertEquals(3, times.size());
        assertTrue(times.containsKey("Jawa Moto"));
        assertTrue(times.containsKey("Skoda Fabia"));
        assertTrue(times.containsKey("Tatra 138"));
    }

    @Test
    public void testFormatTime() {
        String formattedTime = RaceSimulation.formatTime(125.5);
        assertEquals("2m 5.50s", formattedTime);
    }
}