package org.example;

import java.util.Scanner;

public class DistanceConverter {
    public double kmToMile(double kilometers) {
        return kilometers / 1.60934; // 1 kilometer = 0.621371 miles
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DistanceConverter converter = new DistanceConverter();

        System.out.println("Kilometer to Mile Converter");
        System.out.print("Enter the distance in kilometers: ");

        double kilometers = scanner.nextDouble();
        double miles = converter.kmToMile(kilometers);

        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");
        scanner.close();
    }
}