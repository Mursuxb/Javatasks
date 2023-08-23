package Week1_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
        One leiviskä is 20 naula.
        One naula is 32 luoti.
        One luoti is 13.28 grams.
        */

        double luoti, grams, leiviskä, naula;

        System.out.println("Give grams");
        grams = scanner.nextDouble();
        luoti = grams / 13.28;
        naula = luoti / 32;
        leiviskä = Math.floor(naula / 20);
        naula = Math.floor(naula % 20);
        luoti = luoti % 32;


        System.out.printf("%.0f grams is %.0f leiviskä, %.0f naula, and %.2f luoti.", grams, leiviskä, naula, luoti);
    }
}



