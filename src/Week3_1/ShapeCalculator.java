package Week3_1;

import java.util.ArrayList;
import java.util.List;

public class ShapeCalculator {

    public boolean shapesCompatibleForSharedArea(Shape shape1, Shape shape2) {
        if (shape1.getClass() == shape2.getClass()) {
            System.out.println(shape1.getClass() + " and "+ shape2.getClass() + " are compatible for calculating shared area");
            return true;
        } else if (!(shape1 instanceof Circle) && !(shape2 instanceof Circle)) {
            System.out.println(shape1.getClass() + " and "+ shape2.getClass() + " are compatible for calculating shared area");
            return true;
        } else {
            System.out.println(shape1.getClass() + " and "+ shape2.getClass() + " are NOT compatible for calculating shared area");
            return false;
        }
    }


    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle(10));
        shapes.add(new Rectangle(4, 6));
        shapes.add(new Triangle(3, 8));
        for (Shape shape : shapes) {
            shape.calculateArea();
        }
        ShapeCalculator sh = new ShapeCalculator();
        System.out.println(sh.shapesCompatibleForSharedArea(shapes.get(1), shapes.get(2)));
        System.out.println(sh.shapesCompatibleForSharedArea(shapes.get(0), shapes.get(0)));
        System.out.println(sh.shapesCompatibleForSharedArea(shapes.get(0), shapes.get(1)));
    }
}
