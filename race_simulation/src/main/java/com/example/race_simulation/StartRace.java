package com.example.race_simulation;

import java.util.Map;
import java.util.Scanner;

public class StartRace {
    private static final int MAX_RACES = 20;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.print("\nPress Enter to start the simulation or type 'quit' to exit: ");
                String userInput = scanner.nextLine().trim().toLowerCase();

                if (userInput.equals("quit")) {
                    System.out.println("\nExiting the race simulation. Goodbye!\n");
                    break;
                }

                if (!userInput.isEmpty()) {
                    System.out.println("\nInvalid input! Please press Enter to start the simulation or type 'quit' to exit.");
                    continue;
                }

                while (true) {
                    try {
                        System.out.print("\nEnter the number of races to simulate (minimum - 1 to maximum - " + MAX_RACES + "): ");
                        int numberRaces = Integer.parseInt(scanner.nextLine().trim());

                        if (numberRaces < 1) {
                            System.out.println("\nYou must simulate at least 1 race.");
                            continue;
                        } else if (numberRaces > MAX_RACES) {
                            System.out.println("\nYou can only simulate up to " + MAX_RACES + " races.");
                            continue;
                        }

                        for (int i = 0; i < numberRaces; i++) {
                            Map<String, Double> times = RaceSimulation.simulateRace();
                            String winner = times.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
                            System.out.println("\nRace " + (i + 1) + ": Winner is " + winner + " with times: " + formatTimes(times) + " .");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("\nPlease enter a valid number for the number of races.");
                        continue;
                    }

                    String endRaceInput = "";
                    while (true) {
                        System.out.print("\nSimulation complete. Type 'restart' to simulate again or 'quit' to exit: ");
                        endRaceInput = scanner.nextLine().trim().toLowerCase();

                        if (endRaceInput.equals("quit")) {
                            System.out.println("\nExiting the race simulation. Goodbye!\n");
                            return;
                        } else if (endRaceInput.equals("restart")) {
                            System.out.println("\nRestarting the simulation...");
                            break;
                        } else {
                            System.out.println("\nInvalid input! Please type 'restart' to simulate again or 'quit' to exit.");
                        }
                    }
                    if (endRaceInput.equals("restart")) {
                        break;
                    }
                }
            }
            scanner.close();
        }
    }

    private static String formatTimes(Map<String, Double> times) {
        StringBuilder formattedTimes = new StringBuilder();
        for (Map.Entry<String, Double> entry : times.entrySet()) {
            formattedTimes.append(entry.getKey()).append(": ").append(RaceSimulation.formatTime(entry.getValue())).append(", ");
        }
        return formattedTimes.substring(0, formattedTimes.length() - 2);
    }
}
