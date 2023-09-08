package Week3_2;

public abstract class AbstractVehicle implements Vehicle{
    protected String fuelType;
    protected String type;
    protected double distanceTraveled;
    protected double fuelAmount;

    public AbstractVehicle(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        System.out.println(this.type + " is starting...");
    }

    @Override
    public void stop() {
        System.out.println(this.type + " is stopping...");
    }

    @Override
    abstract public void getInfo();

}
