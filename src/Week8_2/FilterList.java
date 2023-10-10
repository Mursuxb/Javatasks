package Week8_2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FilterList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 12, 21, 24, 32, 101);
        Stream<Integer> stream = numbers.stream();
        Integer sum = stream.filter(n -> n % 2 != 0).map(n -> n * 2).reduce(0, (a, b) -> a + b);
    }
}
