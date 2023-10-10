package Week8_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class CollectionOperations {
    public static void main(String[] args) {


        List<Integer> numbers = Arrays.asList(11, 59, 36, 42, 18, 99, 87, 22, 33, 44, 64, 48, 112, 13);
        List<Integer> editedNumbers = new ArrayList<>();
        AtomicInteger sum = new AtomicInteger();

        numbers.forEach((number) -> {
            if (number % 2 == 0) {
                editedNumbers.add(number);
                System.out.println(number);
            }
        });
        System.out.println("\n");
        numbers.forEach((number) -> {
            if (number % 2 == 1) {
                editedNumbers.add(number * 2);
                System.out.println(number * 2);
            }
        });
        System.out.println("\n");
        editedNumbers.forEach((number) -> {
            sum.addAndGet(number);
        });
        System.out.println(sum);

    }
}
