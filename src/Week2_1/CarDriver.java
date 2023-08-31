package Week2_1;

public class CarDriver {

    public static void main(String[] args) {
        Car myCar;

        myCar = new Car("Toyota Corolla", 40.0F, 140.0F, 20.0F);
        myCar.fillTank();

        for(int i = 0; i < 6; i++) {
            myCar.accelerate();
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }

        while(myCar.getSpeed() > 0) {
            myCar.decelerate(15);
            System.out.println(myCar.getTypeName() + ": speed is " + myCar.getSpeed() + " km/h");
        }
        myCar.turnOnCC();
        myCar.setCCSpeed(42);
        myCar.turnOnCC();
        System.out.println("Cruise Control status: " + myCar.getCC());
    }
}
