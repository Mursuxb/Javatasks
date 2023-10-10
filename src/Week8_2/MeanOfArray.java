package Week8_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class MeanOfArray {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 12, 21);
        Stream<Integer> stream = numbers.stream();
        Integer mean = stream.reduce(0, (a, b) -> a + b) / numbers.size();
        System.out.println(mean);
    }

}
