package Alogorithms;

import java.util.Arrays;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 6, i = 0;
        int[] arr = new int[n];
        while (i <= n-1) {
            if (i <= 1) {
                arr[i] = i;
                i++;
                continue;
            }
            arr[i] = arr[i - 1] + arr[i - 2];
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }

    //5 = 0 1 1 2 3 5
}
