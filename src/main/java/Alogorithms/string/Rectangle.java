package Alogorithms.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Rectangle {

    public static void main(String[] args) {
        List<List<Long>> lists = Arrays.asList(Arrays.asList(2L, 1L), Arrays.asList(10L, 7L), Arrays.asList(9L, 5L)
                , Arrays.asList(6L, 9L), Arrays.asList(7L, 3L));
        long l = nearlySimilarRectangles(lists);
        System.out.println(l);
    }

    public static long nearlySimilarRectangles(List<List<Long>> sides) {

        List<Long> collect = sides.stream().flatMap(e -> e.stream()).collect(Collectors.toList());

        int i = 0;
        int j = 2;
        int count = 0;

        while (i < collect.size() && j < collect.size()) {
            double check1 = (double) collect.get(i) / collect.get(j);
            double check2 = (double) collect.get(i + 1) / collect.get(j + 1);
            while (j < collect.size() && (check1 == check2)) {
                count++;
                j = j + 2;
            }
            i = i + 2;
            j = i + 2;
        }

        return count;

    }
}
