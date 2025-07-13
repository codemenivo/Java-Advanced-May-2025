package OOP.L05_Polymorphism.P01_Vehicle;

public class Car extends Vehicle {

    private final static double ADDITIONAL_AC_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption = this.getFuelConsumption() + ADDITIONAL_AC_CONSUMPTION; //Така извикваме защото имаме
                            // protected поле fuelConsumption в класа Vehicle
        // Ако полето fuelConsumption беше private извикването става чрес СУПЕР
        // super.setFuelConsumption(super.getFuelConsumption() + ADDITIONAL_AC_CONSUMPTION);
    }
}
