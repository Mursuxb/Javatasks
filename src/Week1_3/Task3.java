package Week1_3;

import java.util.Scanner;

public class Task3 {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Give start number");
        int start = input.nextInt();
        input.nextLine();
        System.out.println("Give end number");
        int end = input.nextInt();
        for (int i = start; i < end; i++) {
            boolean flag = false;
            for (int j = 2; j <= i / 2; j++) {
                // condition for nonprime number
                if (i % j == 0) {
                    flag = true;
                    //break;
                }
            }
            if (!flag) {
                System.out.println(i);
            }
        }
    }
}