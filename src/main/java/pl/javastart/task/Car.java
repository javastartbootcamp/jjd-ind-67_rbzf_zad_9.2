package pl.javastart.task;

public class Car extends Vehicle {

    private static final double AIR_CONDITION_FACTOR = 0.8;

    public Car(String name, int tankCapacity, double avgFuelConsumption, boolean airConditionOn) {
        super(name, tankCapacity, avgFuelConsumption, airConditionOn);
    }

    @Override
    protected double fuelConsumption() {
        if (airConditionOn) {
            return avgFuelConsumption + AIR_CONDITION_FACTOR;
        } else {
            return super.fuelConsumption();
        }
    }
}

