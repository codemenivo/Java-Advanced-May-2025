package OOP.L05_Polymorphism.P01_Vehicle;

import java.text.DecimalFormat;

public class Vehicle {

    protected double fuelQuantity;
    protected double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption; // Liters per Km
    }


    public String drive(double distance) {

        // Car or Truck
        double fuelNeeded = distance * fuelConsumption;
        if (fuelNeeded > fuelQuantity) {
            // Принтира, че няма достатъчно гориво
            return String.format("%s needs refueling", this.getClass().getSimpleName());
        }

        this.setFuelQuantity(this.fuelQuantity - fuelNeeded);
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        return String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat.format(distance));

    }


    // Refuel tank for Car or Truck
    public void refuel(double litters) {
        this.setFuelQuantity(this.fuelQuantity + litters);
    }


    //   Getters and Setters
    public double getFuelQuantity() {
        return this.fuelQuantity;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }


    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.getFuelQuantity());
    }
}
