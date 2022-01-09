package arrays;

import java.util.Arrays;

public class DeleteArrayElement {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int[] ints = removeElement(arr, 2);
        System.out.println(ints);
    }

    public static int[] removeElement(int[] arr, int inx) {
        if (arr.length == 0) {
            return arr;
        }

        if (inx > arr.length) {
            throw new IllegalArgumentException("Incorrect index value");
        }

        int[] left = Arrays.copyOfRange(arr, 0, inx);
        int[] right = Arrays.copyOfRange(arr, inx + 1, arr.length);
        int[] result = new int[left.length + right.length];
        System.arraycopy(left, 0, result, 0, left.length);
        System.arraycopy(right, 0, result, left.length, right.length);
        return result;
    }
}
