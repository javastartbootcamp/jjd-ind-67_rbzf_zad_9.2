package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0] = new Car("Toyota Yaris", 42, 4.5, false);
        vehicles[1] = new Car("Fiat Panda", 37, 5.4, false);
        vehicles[2] = new Car("BMW X6", 85, 10.1, false);
        vehicles[3] = new Truck("Volvo FH16", 1480, 36.3, false, 30_000);
        vehicles[4] = new Truck("Star 200", 150, 19, false, 1_000);

        System.out.println("Klimatyzacja wylaczona:");
        for (Vehicle vehicle : vehicles) {
            vehicle.printInfo();
        }
        System.out.println("Klimatyzacja wlaczona:");
        for (Vehicle vehicle : vehicles) {
            vehicle.setAirConditionOn(true);
            vehicle.printInfo();
        }
    }
}
