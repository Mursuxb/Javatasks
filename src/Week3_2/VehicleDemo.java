package Week3_2;

public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car("Petrol", "Red");
        Motorcycle motorcycle = new Motorcycle("Gasoline", "Black");
        Bus bus = new Bus("Diesel", 40);

        car.start();
        car.stop();
        car.getInfo();
        System.out.println("\n");
        motorcycle.start();
        motorcycle.stop();
        motorcycle.getInfo();
        System.out.println("\n");
        bus.start();
        bus.refuel();
        bus.drive();
        bus.drive();
        System.out.println("Fuel efficiency: " + bus.calculateFuelEfficiency() + "KPL");
        bus.stop();
        bus.getInfo();
    }
}
