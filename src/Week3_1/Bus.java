package Week3_1;

public class Bus extends Car {
    private int passengerCapacity;
    private int passengerAmount = 0;

    public Bus(String typeName, float gasolineLevelCapacity, float topSpeed, float CCMinSpeed, int passengerCapacity) {
        super(typeName, gasolineLevelCapacity, topSpeed, CCMinSpeed);
        this.passengerCapacity = passengerCapacity;
    }

    public void passengerEnter() {
        if (getSpeed() != 0) {
            System.out.println("Bus is moving");
        } else {
            if (passengerAmount < passengerCapacity) {
                passengerAmount += 1;
            } else
                System.out.println("Bus is full");
        }
    }

    public void passengerExit() {
        if (getSpeed() != 0) {
            System.out.println("Bus is moving");
        } else {
            if (passengerAmount > 0) {
                passengerAmount -= 1;
            } else
                System.out.println("Bus is empty");
        }
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }

    public static void main(String[] args) {
        Bus bus = new Bus("560", 40, 90, 20, 30);
        bus.fillTank();
        bus.accelerate();
        System.out.println("Current speed: " + bus.getSpeed());
        bus.passengerEnter();
        bus.decelerate(10);
        bus.passengerEnter();
        bus.passengerEnter();
        System.out.println("Bus is holding " + bus.getPassengerAmount() + " passengers");
        bus.passengerExit();
        System.out.println("Bus is holding " + bus.getPassengerAmount() + " passengers");
    }
}
