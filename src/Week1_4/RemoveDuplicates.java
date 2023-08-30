package Week1_4;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kuinka monta numeroa listaan?");
        int intAmount = scanner.nextInt();
        int[] intArray = new int[intAmount];
        for (int i = 0; i < intAmount; i++) {
            System.out.println("Anna kokonaisnumeroita");
            int x = scanner.nextInt();
            scanner.nextLine();
            intArray[i] = x;
        }
        int[] dupliArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            int value = intArray[i];
            boolean duplicate = false;
            for (int j = 0; j < dupliArray.length; j++) {
                if (value == dupliArray[j]) {
                    duplicate = true;
                }
            }
            if (duplicate == false) {
                dupliArray[i] = value;
            }
        }
        System.out.println(Arrays.toString(dupliArray));
    }
}
