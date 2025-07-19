package OOP.L05_Polymorphism.P02_Vehicles_Extension;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        //Create car
        Vehicle car = createVehicle(input);

        input = scanner.nextLine().split("\\s+");

        //Create truck
        Vehicle truck = createVehicle(input);

        input = scanner.nextLine().split("\\s+");

        //Create bus
        Vehicle bus = createVehicle(input);


        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        //int countCommands = Integer.parseInt(scanner.nextLine());
        int countCommands = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= countCommands ; i++) {

            input = scanner.nextLine().split("\\s+");
            String commandName = input[0];
            String vehicleType = input[1];

            switch (commandName) {

                //Drive Car {distance}
                case "Drive" -> {
                    double distance = Double.parseDouble(input[2]);
                    String driveMessage = vehicles.get(vehicleType).drive(distance); //Car as object -> drive()
                    System.out.println(driveMessage);

                }

                //Refuel Car {liters}
                case "Refuel" -> {
                    double fuelAmount = Double.parseDouble(input[2]);
                  vehicles.get(vehicleType).refuel(fuelAmount);

                }

                case "DriveEmpty" -> {
                    double distance = Double.parseDouble(input[2]);
                    Bus busToDrive = (Bus) vehicles.get(vehicleType);
                    String driveMessage = busToDrive.driveEmpty(distance);  //Car as object -> drive()
                    System.out.println(driveMessage);

                }



            }

        }

        vehicles.values().forEach(System.out::println);



    }

    private static Vehicle createVehicle(String[] input) {
        String vehicleType = input[0];;
        double fuelQuantity = Double.parseDouble(input[1]);
        double fuelConsumption = Double.parseDouble(input[2]);
        double fuelTankCapacity = Double.parseDouble(input[3]);

        Vehicle vehicle = null;

        switch (vehicleType) {
            case "Car" -> vehicle = new Car(fuelQuantity, fuelConsumption, fuelTankCapacity);
            case "Truck" -> vehicle = new Truck(fuelQuantity, fuelConsumption, fuelTankCapacity);
            case "Bus" -> vehicle = new Bus(fuelQuantity, fuelConsumption, fuelTankCapacity);
        }
        return vehicle;
    }
}
