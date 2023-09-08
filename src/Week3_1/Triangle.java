package Week3_1;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        double area = 0.5 * this.base * this.height;
        System.out.println("Area of Triangle with base " + this.base + " and height " + this.height + ": " + area);
        return area;
    }
}
