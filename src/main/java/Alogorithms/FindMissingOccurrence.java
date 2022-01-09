package Alogorithms;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindMissingOccurrence {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6, 6, 3, 1};
        int result = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
                .entrySet().stream()
                .min(Map.Entry.comparingByValue()).stream()
                .findFirst().orElse(Map.entry(-1, -1L)).getKey();
        System.out.println(result);

        int i = Arrays.stream(arr).boxed().reduce(Integer::sum).get();
        System.out.println(i);
    }
}
