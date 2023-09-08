package Week3_2;

//Task 1
//public class Bus implements Vehicle {
//    String fuelType;
//    int passengerCapacity;
//
//    public Bus(String fuelType, int passengerCapacity) {
//        this.fuelType = fuelType;
//        this.passengerCapacity = passengerCapacity;
//    }
//
//    @Override
//    public void start() {
//        System.out.println("Bus is starting...");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Bus is stopping...");
//    }
//
//    @Override
//    public void getInfo() {
//        System.out.println("Bus information:");
//        System.out.println("Type: Bus");
//        System.out.println("Fuel: " + fuelType);
//        System.out.println("Capacity: " + passengerCapacity + " passengers");
//    }
//}
//Task 2
public class Bus extends AbstractVehicle {
    private int passengerCapacity;

    public Bus(String fuelType, int passengerCapacity) {
        super(fuelType);
        this.type = "Bus";
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void getInfo() {
        System.out.println("Bus information:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Passenger capacity: " + this.passengerCapacity);
    }
}
