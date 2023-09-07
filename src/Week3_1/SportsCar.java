package Week3_1;

import Week2_1.Car;

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
        super.accelerate();
        gasolineLevel = gasolineLevel-gasolineConsumption;

    }

    public static void main(String[] args) {
        Car car = new Car("Volkswagen Golf", 30,130,20);
        SportsCar car2 = new SportsCar("Stinger", 30, 160, 20, 1.5F);
        car2.fillTank();
        car2.accelerate();
        car2.accelerate();
        car.accelerate();
        System.out.println(car2.speed);
        System.out.println(car2.getGasolineLevel());
    }
}
