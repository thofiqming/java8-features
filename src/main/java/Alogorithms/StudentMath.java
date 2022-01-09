package Alogorithms;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class StudentMath {
    public static void main(String[] args) throws IOException {
        int[] arr = {1, 2, 3, 4};
        int target = 9;
        int result = 0;

        List<Integer> collect = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        int tempTarget = 0;
        for (Integer integer : collect) {
            if (tempTarget == target) {
                break;
            }
            if (integer > target || tempTarget + integer > target) {
            } else {
                tempTarget = tempTarget + integer;
                result = result + 1;
            }
        }
        System.out.println(result);
    }
}

