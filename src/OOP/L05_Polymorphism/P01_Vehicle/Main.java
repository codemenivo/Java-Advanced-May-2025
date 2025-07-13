package OOP.L05_Polymorphism.P01_Vehicle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");


        // Create Car

        Vehicle car = createVehicle(input);

        input = scanner.nextLine().split("\\s+");

        // Create Truck

        Vehicle truck = createVehicle(input);

        Map<String, Vehicle> vehiclesMap = new LinkedHashMap<>();
        vehiclesMap.put("Car", car);
        vehiclesMap.put("Truck", truck);

        int commands = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= commands; i++) {

            input = scanner.nextLine().split("\\s+");
            String commandName = input[0];
            String vehicleType = input[1];

            switch (commandName) {
                case "Drive" -> {
                    double distance = Double.parseDouble(input[2]);
                    String driveMessage = vehiclesMap.get(vehicleType).drive(distance);
                    System.out.println(driveMessage);
                }
                case "Refuel" -> {
                    double refuelAmount = Double.parseDouble(input[2]);
                    vehiclesMap.get(vehicleType).refuel(refuelAmount);
                }
            }

        }

        vehiclesMap.values().forEach(System.out::println);

    }

    private static Vehicle createVehicle(String[] input) {

        String vehicleType = input[0];
        double fuelQuantity = Double.parseDouble(input[1]);
        double fuelConsumption = Double.parseDouble(input[2]);

        Vehicle vehicle = null;
        switch (vehicleType) {
            case "Car" -> vehicle = new Car(fuelQuantity, fuelConsumption);
            case "Truck" -> vehicle = new Truck(fuelQuantity, fuelConsumption);
        }

        return vehicle;
    }
}
