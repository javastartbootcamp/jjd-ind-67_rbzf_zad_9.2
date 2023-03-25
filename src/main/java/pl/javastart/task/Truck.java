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

    public void increaseAvgFuelConsumption() {
        if (isAirConditionOn()) {
            setAvgFuelConsumption(getAvgFuelConsumption() + AIR_CONDITION_FACTOR);
        }
        if (cargo > 0) {
            setAvgFuelConsumption(getAvgFuelConsumption() + CARGO_FACTOR * (cargo / 100.0));
        }
    }

    public double range() {
        return super.range();
    }

}

