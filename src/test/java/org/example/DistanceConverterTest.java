package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DistanceConverterTest {
    private DistanceConverter converter;

    @BeforeEach
    public void setUp() {
        converter = new DistanceConverter();
    }

    @Test
    public void testKmToMileConversion() {
        double kilometers = 10.0; // Example input
        double expectedMiles = kilometers / 1.60934;

        double actualMiles = converter.kmToMile(kilometers);

        // Use assertEquals to compare the expected and actual results
        assertEquals(expectedMiles, actualMiles, 0.001); // Allow a small tolerance for floating-point comparison
    }

    @Test
    public void testZeroKmToMileConversion() {
        double kilometers = 0.0; // Example input
        double expectedMiles = 0.0; // Expected result for zero kilometers

        double actualMiles = converter.kmToMile(kilometers);

        // Use assertEquals to compare the expected and actual results
        assertEquals(expectedMiles, actualMiles, 0.001); // Allow a small tolerance for floating-point comparison
    }
}
