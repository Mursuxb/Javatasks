package Week3_2;

//Task 1
//public class Motorcycle implements Vehicle{
//    String fuelType;
//    String color;
//
//    public Motorcycle(String fuelType, String color) {
//        this.fuelType = fuelType;
//        this.color = color;
//    }
//
//    @Override
//    public void start() {
//        System.out.println("Motorcycle is starting...");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Motorcycle is stopping...");
//    }
//
//    @Override
//    public void getInfo() {
//        System.out.println("Motorcycle information:");
//        System.out.println("Type: Motorcycle");
//        System.out.println("Fuel: " + fuelType);
//        System.out.println("Color: " + color);
//    }
//}
//Task 2
public class Motorcycle extends AbstractVehicle {
    private String color;

    public Motorcycle(String fuelType, String color) {
        super(fuelType);
        this.type = "Motorcycle";
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("Motorcycle information:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Color: " + color);
    }
}
