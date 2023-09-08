package Week3_1;

public class Circle extends Shape {
    private double diameter;
    private double radius;

    public Circle(float diameter){
        this.diameter = diameter;
        this.radius = diameter/2;
    }

    @Override
    public double calculateArea() {
        double area = (Math.PI*(this.radius*this.radius));
        System.out.println("Area of Circle with radius " + this.radius+ ": "+ area);
        return area;
    }
}
