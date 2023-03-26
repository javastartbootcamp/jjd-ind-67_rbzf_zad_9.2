package pl.javastart.task;

public class Truck extends Car {

    private static final double AIR_CONDITION_FACTOR = 1.6;
    private static final double CARGO_FACTOR = 0.5;

    private int cargo;

    public Truck(String name, int tankCapacity, double avgFuelConsumption, boolean airConditionOn, int cargo) {
        super(name, tankCapacity, avgFuelConsumption, airConditionOn);
        this.cargo = cargo;
    }

    public int getCargo() {
        return cargo;
    }

    public void setCargo(int cargo) {
        this.cargo = cargo;
    }

    public double range() {
        if (airConditionOn && cargo >= 100) {
            return 100 / (avgFuelConsumption + AIR_CONDITION_FACTOR + CARGO_FACTOR * (cargo / 100));
        } else if (!airConditionOn && cargo >= 100) {
            return 100 / (avgFuelConsumption + CARGO_FACTOR * (cargo / 100));
        } else if (airConditionOn && cargo < 100) {
            return 100 / (avgFuelConsumption + AIR_CONDITION_FACTOR);
        } else {
            return 100 / avgFuelConsumption;
        }
    }
}

