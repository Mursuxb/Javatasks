package Week3_2;

public class ElectricCar implements ElectricVehicle {
    private double batteryCharge;
    private double OSVersion;
    private boolean engineActive;
    private String color;
    private String model;
    public ElectricCar(String color, String model){
        this.color = color;
        this.model = model;
    }

    @Override
    public void charge() {
        System.out.println("Charging...");
        this.batteryCharge = 100;
    }

    @Override
    public void updateOS() {
        if (this.OSVersion < 2.0) {
            if (this.batteryCharge != 0) {
                System.out.println("Updating OS...");
                this.OSVersion = 2.0;
            } else {
                System.out.println("Not enough charge to update");
            }
        } else {
            System.out.println("OS is up to date");
        }

    }

    @Override
    public void start() {
        if (!this.engineActive) {
            System.out.println("Turning engine on...");
            this.engineActive = true;
        } else {
            System.out.println("Engine already active");
        }

    }

    @Override
    public void shutdown() {
        if (this.engineActive) {
            System.out.println("Turning engine off...");
        } else {
            System.out.println("Engine already off");
        }

    }
}
