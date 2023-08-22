package Week1_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Fahrenheit to Celsius
        Scanner scanner = new Scanner(System.in);

        double celsius, fahrenheit;
        System.out.println("Gimme Celsius");
        celsius = scanner.nextDouble();
        fahrenheit = 1.8*celsius+32;
        System.out.printf("%.1f degrees celsius is %.1f degrees fahrenheit", celsius, fahrenheit);

    }
}