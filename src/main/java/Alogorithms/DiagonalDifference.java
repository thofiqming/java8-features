package Alogorithms;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class DiagonalDifference {

    public static void main(String[] args) {
        var i = diagonalDifference(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(9, 8, 9)));
        System.out.println(i);
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        List<Integer> list = arr.stream().flatMap(Collection::stream).collect(Collectors.toList());
        int size = arr.size();
        int i = 0, j = size - 1;
        int leftDiagonalSum = 0;
        int rightDiagonalSum = 0;
        while (i < list.size() && j < list.size()) {
            leftDiagonalSum += list.get(i);
            rightDiagonalSum += list.get(j);
            i = i + (size + 1);
            j = j + (size - 1);
        }
        return Math.abs(leftDiagonalSum - rightDiagonalSum);
    }
}


