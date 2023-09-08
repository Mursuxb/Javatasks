package Week3_1;

import java.sql.SQLOutput;

public class SportsCar extends Car {
    private float gasolineConsumption;
    private float speed;
    private float gasolineLevel;

    public SportsCar(String typeName, float gasolineLevelCapacity, float topSpeed, float CCMinSpeed, float gasolineConsumption) {
        super(typeName, gasolineLevelCapacity, topSpeed, CCMinSpeed);
        speed = 0;
        gasolineLevel = 0;
        this.gasolineConsumption = gasolineConsumption;
    }

    @Override
    public void accelerate() {
        if (getGasolineLevel() > 0) {
            System.out.println("Accelerating");
            setSpeed(getSpeed() + 10);
            setGasolineLevel(getGasolineLevel()-this.gasolineConsumption);
        } else {
            setSpeed(0);
            System.out.println("No Gas, can't accelerate");
        }


    }

    public static void main(String[] args) {
        Car car = new Car("Volkswagen Golf", 30, 130, 20);
        SportsCar car2 = new SportsCar("Stinger", 30, 160, 20, 1.5F);
        car2.fillTank();
        System.out.println(car2.getGasolineLevel());
        car2.accelerate();
        car2.accelerate();
        car.accelerate();
        System.out.println("1. " + car2.getSpeed());
        car2.accelerate();
        System.out.println("2. " + car2.getSpeed());
        System.out.println("3. " + car2.getGasolineLevel());
    }
}
