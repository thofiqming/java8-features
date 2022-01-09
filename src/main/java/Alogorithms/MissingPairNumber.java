package Alogorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MissingPairNumber {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 5};
        int solution = solution(arr);
        System.out.println(solution);
    }

    public static int solution(int[] arr) {
        //missing number 1,6,5,2,4 => 1,2,4,5,6

        List<Integer> list = Arrays.stream(arr).boxed().sorted().collect(Collectors.toList());
        boolean reachedend = false;
        for (int i = 1; i <= list.size(); i++) {
            if (i == list.get(list.size() - 1)) reachedend = true;
            if (list.contains(i)) {
                if (reachedend) return i + 1;
            } else {
                return i;
            }
        }
        return 1;
    }
}
