package Week1_4;

import java.util.Random;
import java.util.Scanner;

public class NameGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] firstNames = {"Pena", "Jaakko", "Timo", "Jaska", "Taneli"};
        String[] surNames = {"Koskela", "Toivakka", "Herman", "Gonzales", "Yrgen"};
        System.out.println("Kuinka monta nimeä generoidaan?");
        int input = scanner.nextInt();
        for (int i = 1; i <= input; i++) {
            System.out.println(firstNames[random.nextInt(5)]+ " " +surNames[random.nextInt(5)]);
        }
    }
}
