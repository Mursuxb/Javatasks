package Week1_3;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();
        double discriminant= b * b - 4.0 * a * c;
        if (discriminant> 0.0)
        {
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.printf("The roots are %.4f and %.4f", r1, r2);
        }
        else if (discriminant == 0.0)
        {
            double r1 = -b / (2.0 * a);
            System.out.printf("The root is %.4f", r1);
        }
        else
        {
            System.out.println("No real roots");
        }
    }
}
