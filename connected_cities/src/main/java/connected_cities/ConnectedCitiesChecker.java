package connected_cities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ConnectedCitiesChecker {
    private HashMap<String, HashSet<String>> cityGraph = new HashMap<>();

    public void loadCitiesNodes(String filePath) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) continue;

                String[] cities = line.split(",");
                if (cities.length != 2) {
                    throw new IllegalArgumentException("Error: Line '" + line + "' is not properly formatted. Excepted format: 'City1, City2'.");
                }

                String city1 = cities[0].trim();
                String city2 = cities[1].trim();

                if (city1.equals(city2)) {
                    System.out.println("Warning: Ignoring self-loop for city '" + city1 + "'. A city node cannot connect to itself.");
                    continue;
                }

                cityGraph.putIfAbsent(city1, new HashSet<>());
                cityGraph.putIfAbsent(city2, new HashSet<>());
                cityGraph.get(city1).add(city2);
                cityGraph.get(city2).add(city1);
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("The file '" + filePath + "' was not found.");
        } catch (IOException e) {
            throw new IOException("An error occurred while reading the file '" + filePath + "'.", e);
        }
    }

    public boolean checkConnectedCities(String city1, String city2) {
        if (!cityGraph.containsKey(city1) && !cityGraph.containsKey(city2)) {
            System.out.println("Error: Both cities '" + city1 + "' and '" + city2 + "' do not exist in the graph.");
            return false;
        } else if (!cityGraph.containsKey(city1)) {
            System.out.println("Error: City '" + city1 + "' does not exist in the graph.");
            return false;
        } else if (!cityGraph.containsKey(city2)) {
            System.out.println("Error: City '" + city2 + "' does not exist in the graph.");
            return false;
        }

        HashSet<String> visited = new HashSet<>();
        return dfs(city1, city2, visited);
    }

    private boolean dfs(String currentCity, String targetCity, HashSet<String> visited) {
        if (currentCity.equals(targetCity)) return true;
        visited.add(currentCity);
        
        for (String neighbour : cityGraph.get(currentCity)) {
            if (!visited.contains(neighbour)) {
                if (dfs(neighbour, targetCity, visited))
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ConnectedCitiesChecker cc = new ConnectedCitiesChecker();
        String filePath = "connected_cities/CitiesNodes.txt";

        try {
            cc.loadCitiesNodes(filePath);
            System.out.println("Graph loaded successfully.");

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Enter the first city (or type 'exit' to quit): ");
                String city1 = scanner.nextLine().trim();
                if (city1.equalsIgnoreCase("exit"))
                break;

                System.out.print("Enter the second city (or type 'exit' to quit): ");
                String city2 = scanner.nextLine().trim();
                if (city2.equalsIgnoreCase("exit"))
                break;

                if (cc.checkConnectedCities(city1, city2)) {
                    System.out.println(city1 + " and " + city2 + " are connected.");
                } else {
                    System.out.println(city1 + " and " + city2 + " are NOT connected.");
                }
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}