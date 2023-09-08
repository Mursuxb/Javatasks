package Week3_2;

public class ElectricDemo {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("White", "Tesla Model S");
        ElectricMotorcycle yamaha = new ElectricMotorcycle("Red");
        tesla.updateOS();
        tesla.charge();
        tesla.start();
        tesla.updateOS();
        yamaha.start();
        yamaha.charge();
        yamaha.updateOS();
    }
}
