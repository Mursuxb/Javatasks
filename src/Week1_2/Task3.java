package Week1_2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int leiviskä, naula;
        double luoti;
        System.out.println("Give lenght of first side");
        side1 = scanner.nextDouble();
        System.out.println("Give lenght of next side");
        side2 = scanner.nextDouble();

        hypo = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
        System.out.printf("The hypotenus is %.1f units long", hypo);
    }
}



