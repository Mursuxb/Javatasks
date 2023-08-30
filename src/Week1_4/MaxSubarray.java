package Week1_4;

import java.util.Scanner;

public class MaxSubarray {

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
        int n = intArray.length;
        int maximumSubArraySum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        for (int left = 0; left < n; left++) {

            int runningWindowSum = 0;

            for (int right = left; right < n; right++) {
                runningWindowSum += intArray[right];

                if (runningWindowSum > maximumSubArraySum) {
                    maximumSubArraySum = runningWindowSum;
                    start = left;
                    end = right;
                }
            }
        }
        System.out.printf("Found Maximum Subarray between %d and %d", start, end);
        System.out.println("\n Largest sum found was " + maximumSubArraySum);
    }
}
