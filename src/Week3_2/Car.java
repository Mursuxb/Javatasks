package Week3_2;

//Task1
//public class Car implements Vehicle{
//    String fuelType;
//    String color;
//
//    public Car(String fuelType, String color) {
//        this.fuelType = fuelType;
//        this.color = color;
//    }
//
//    @Override
//    public void start() {
//        System.out.println("Car is starting...");
//    }
//
//    @Override
//    public void stop() {
//        System.out.println("Car is stopping...");
//    }
//
//    @Override
//    public void getInfo() {
//        System.out.println("Car information:");
//        System.out.println("Type: Car");
//        System.out.println("Fuel: " + fuelType);
//        System.out.println("Color: " + color);
//    }
//}

//Task2
public class Car extends AbstractVehicle{
    private String color;
    public Car(String fuelType,String color) {
        super(fuelType);
        this.type = "Car";
        this.color = color;
    }

    @Override
    public void getInfo() {
        System.out.println("Car information:");
        System.out.println("Type: " + type);
        System.out.println("Fuel: " + fuelType);
        System.out.println("Color: " + color);
    }
}
