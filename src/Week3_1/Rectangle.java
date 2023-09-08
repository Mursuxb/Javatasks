package Week3_1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = this.width * this.height;
        System.out.println("Area of Rectangle with width " + this.width + " and height " + this.height + ": " + area);
        return area;
    }
}
