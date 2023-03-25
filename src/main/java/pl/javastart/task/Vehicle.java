package pl.javastart.task;

public class Vehicle {
    private String name;
    private int tankCapacity;
    private double avgFuelConsumption;

    public Vehicle(String name, int tankCapacity, double avgFuelConsumption) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.avgFuelConsumption = avgFuelConsumption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public void setTankCapacity(int tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    public double getAvgFuelConsumption() {
        return avgFuelConsumption;
    }

    public void setAvgFuelConsumption(double avgFuelConsumption) {
        this.avgFuelConsumption = avgFuelConsumption;
    }

    public void increaseAvgFuelConsumption() {
    }

    public double range() {
        return 100 / avgFuelConsumption;
    }
}
