package pl.javastart.task;

public class Car extends Vehicle {

    private static final double AIR_CONDITION_FACTOR = 0.8;
    private boolean airConditionOn;

    public Car(String name, int tankCapacity, double avgFuelConsumption, boolean airConditionOn) {
        super(name, tankCapacity, avgFuelConsumption);
        this.airConditionOn = airConditionOn;
    }

    public boolean isAirConditionOn() {
        return airConditionOn;
    }

    public void setAirConditionOn(boolean airConditionOn) {
        this.airConditionOn = airConditionOn;
    }

    public void increaseAvgFuelConsumption() {
        if (airConditionOn) {
            setAvgFuelConsumption(getAvgFuelConsumption() + AIR_CONDITION_FACTOR);
        }
    }

    public double range() {
        return super.range();

    }

}

