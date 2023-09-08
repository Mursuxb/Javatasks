package Week3_1;

public class Shape {
    private double area;

    public double calculateArea(){
        return area;
    }

    public static void main(String[] args) {
        Shape test = new Shape();
        System.out.println(test.calculateArea());
    }
}
