package Week1_2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        // Fahrenheit to Celsius
        Scanner scanner = new Scanner(System.in);

        double celsius, fahrenheit;
        System.out.println("Gimme Fahrenheit");
        fahrenheit = scanner.nextDouble();
        celsius = (fahrenheit-32)*5/9;
        System.out.printf("%.1f degrees fahrenheit is %.1f degrees celsius", fahrenheit, celsius);

    }
}