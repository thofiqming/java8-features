package circlescompany;

import java.util.*;
import java.util.stream.IntStream;

public class CodePair {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 9, 10, 11, -4, -5};
        List<Integer> result = new ArrayList<>();

        int i = 0;
        while (i < arr.length) {
            Integer[] subArray = IntStream.range(i + 1, arr.length).mapToObj(x -> arr[x]).toArray(Integer[]::new);
            if (subArray.length == 0 || arr[i] > max(subArray)) {
                result.add(arr[i]);
            }
            i++;
        }
        System.out.println(result);
    }

    private static int max(Integer[] arr) {
        return Arrays.stream(arr).max(Comparator.naturalOrder()).get();
    }
}


