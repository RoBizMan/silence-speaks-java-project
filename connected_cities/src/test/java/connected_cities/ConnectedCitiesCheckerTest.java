package connected_cities;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class ConnectedCitiesCheckerTest {
    private ConnectedCitiesChecker cc;

    @BeforeEach
    public void setUp() throws IOException {
        cc = new ConnectedCitiesChecker();
        String testFilePath = "testCityNodes.txt";
        try (FileWriter writer = new FileWriter(testFilePath)) {
            writer.write("London, Bristol\n");
            writer.write("Bristol, Birmingham\n");
            writer.write("Plymouth, Nottingham\n");
            writer.write("Dundee, Liverpool\n");
            writer.write("Leicester, Bristol\n");
        }
        cc.loadCitiesNodes(testFilePath);
    }

    @Test
    public void testCheckConnectedCities_ValidConnection() {
        boolean result = cc.checkConnectedCities("London", "Bristol");
        System.out.println("London and Bristol are connected: " + result);
        assertTrue(result, "London should be connected to Bristol.");
    }

    @Test
    public void testCheckConnectedCities_NoConnection() {
        boolean result = cc.checkConnectedCities("Plymouth", "Leicester");
        System.out.println("Plymouth and Leicester are connected: " + result);
        assertFalse(result, "Plymouth should NOT be connected to Leicester.");
    }

    @Test
    public void testCheckConnectedCities_NonExistentCity() {
        boolean result1 = cc.checkConnectedCities("Dublin", "Bristol");
        System.out.println("Dublin and Bristol are connected: " + result1);
        assertFalse(result1, "Dublin should NOT exist in the graph.");

        boolean result2 = cc.checkConnectedCities("London", "Cork");
        System.out.println("London and Cork are connected: " + result2);
        assertFalse(result2, "Cork should NOT exist in the graph.");

        boolean result3 = cc.checkConnectedCities("Dublin", "Cork");
        System.out.println("Dublin and Cork are connected: " + result3);
        assertFalse(result3, "Both cities should not exist in the graph.");
    }
}