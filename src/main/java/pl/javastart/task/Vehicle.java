package pl.javastart.task;

public class Vehicle {
    private String name;
    private int tankCapacity;
    protected double avgFuelConsumption;
    protected boolean airConditionOn;

    public Vehicle(String name, int tankCapacity, double avgFuelConsumption, boolean airConditionOn) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.avgFuelConsumption = avgFuelConsumption;
        this.airConditionOn = airConditionOn;
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

    public double range() {
        return 100 / avgFuelConsumption;
    }

    public void printInfo() {
        System.out.printf("%13s %s %5.2f km \n", name, " - zasieg - ", range());
    }
}
