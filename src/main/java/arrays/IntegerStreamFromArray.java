package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class IntegerStreamFromArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        Arrays.stream(arr).boxed().forEach(System.out::println);
        Stream.of(arr).map(e -> Arrays.stream(e).boxed()).forEach(e -> e.mapToInt(y -> y).forEach(System.out::println));
    }
}
