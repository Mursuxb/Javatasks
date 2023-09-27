package Week6_3.Model;

public class Pet {
    private double positionX;
    private double positionY;

    public Pet(double positionX, double positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
    }


    public double getPositionX() {
        return positionX;
    }

    public double getPositionY() {
        return positionY;
    }

    public void move(double x, double y) {
        this.positionX += x;
        this.positionY += y;
    }
}
