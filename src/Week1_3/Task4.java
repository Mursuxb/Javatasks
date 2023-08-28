package Week1_3;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        boolean running = true;
        while (running) {
            int correct = 0;
            for (int i = 1; i <= 10; i++) {
                int fac1 = random.nextInt(10) + 1;
                int fac2 = random.nextInt(10) + 1;
                System.out.printf("What is %d times %d? \n", fac1, fac2);
                int answer = input.nextInt();
                if (answer == (fac1 * fac2)) {
                    System.out.println("Correct");
                    correct++;
                } else {
                    System.out.println("Incorrect");
                }
            }
            if (correct == 10) {
                System.out.println("Congratulations you have gotten all 10 answers correct!!!");
                System.out.println("Shutting down");
                running = false;
            } else {
                System.out.printf("You got %d answers correct, lets try that again \n", correct);
            }
        }
    }
}
