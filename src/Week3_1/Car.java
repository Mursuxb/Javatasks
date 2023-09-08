package Week3_1;

public class Car {
    /* An object of class Car will have instance variables speed and gasolineLevel.
     * Both are private (they can not be accessed outside the class methods).
     * Keep instance variables private whenever possible.
     */
    private float speed;
    private float topSpeed;
    private float gasolineLevelCapacity;
    private float gasolineLevel;
    private String typeName;
    private boolean CC;
    private float CCMaxSpeed, CCMinSpeed, CCSetSpeed;


    /* This is the method (constructor) called when a new instance of Car is created (with new).
     * Constructors may also have arguments.
     */
    public Car(String typeName, float gasolineLevelCapacity, float topSpeed, float CCMinSpeed) {
        speed = 0;
        gasolineLevel = 0;
        this.typeName = typeName;   // this refers to the object itself.
        this.gasolineLevelCapacity = gasolineLevelCapacity;
        this.topSpeed = topSpeed;
        this.CCMaxSpeed = topSpeed;
        this.CCMinSpeed = CCMinSpeed;
        // The reference is useful if you want to use parameter names that are
        // identical to instance variable names (and for more, later on)
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getTopSpeed() {
        return topSpeed;
    }

    public float getGasolineLevelCapacity() {
        return gasolineLevelCapacity;
    }

    public void setGasolineLevel(float gasolineLevel) {
        this.gasolineLevel = gasolineLevel;
    }


    /* Implementations of some methods.
     * Note that methods refer to and change instance variable values.
     */
    public void accelerate() {
        if (gasolineLevel > 0)
            speed += 10;
        else
            speed = 0;
    }

    public void decelerate(int amount) {
        if (gasolineLevel > 0) {
            if (amount > 0)
                speed = Math.max(0, speed - amount);
        } else
            speed = 0;
    }

    public float getSpeed() {
        return this.speed;
    }

    public String getTypeName() {
        return typeName;
    }

    public void fillTank() {
        this.gasolineLevel = this.gasolineLevelCapacity;
    }

    public float getGasolineLevel() {
        return gasolineLevel;
    }

    public void turnOnCC() {
        if (this.CCSetSpeed != 0) {
            this.CC = true;
            while (this.CC && this.speed != this.CCSetSpeed) {
                if (this.gasolineLevel == 0) {
                    this.CC = false;
                }
                if (this.speed < this.CCSetSpeed) {
                    accelerate();
                    System.out.println("Accelerating");
                } else if (this.speed > this.CCSetSpeed) {
                    decelerate(1);
                    System.out.println("Decelerating");
                }
            }
        } else {
            System.out.println("Cruise control speed not assigned!");
        }
    }
    public boolean getCC(){
        return this.CC;
    }

    public void setCCSpeed(float CCSpeed) {
        if (CCSpeed >= this.CCMinSpeed && CCSpeed <= this.CCMaxSpeed) {
            this.CCSetSpeed = CCSpeed;
        } else {
            System.out.println("Cruise control speed not reachable");
            this.CC = false;
        }
    }
}
