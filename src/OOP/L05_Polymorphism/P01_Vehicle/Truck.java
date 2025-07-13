package OOP.L05_Polymorphism.P01_Vehicle;

public class Truck extends Vehicle {

    private final static double ADDITIONAL_AC_CONSUMPTION = 1.6;
    private final static double FUEL_LEAK_CORRECTION_PERCENTAGE = 0.95;

    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption = this.getFuelConsumption() + ADDITIONAL_AC_CONSUMPTION;
    }


    @Override
    public void refuel(double litters) {
        litters = litters * FUEL_LEAK_CORRECTION_PERCENTAGE;
        // алтернативен вариант ->  this.fuelQuantity += litters;
        super.refuel(litters);
    }
}
