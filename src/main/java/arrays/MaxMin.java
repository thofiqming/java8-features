package arrays;

import java.util.Arrays;

public class MaxMin {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 9, 12, -1, -2};

        System.out.println("max = " + Arrays.stream(arr).max().getAsInt() +
                "  " + "min = " + Arrays.stream(arr).min().getAsInt());

    }
}
