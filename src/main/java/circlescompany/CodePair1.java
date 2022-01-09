package circlescompany;

import java.util.ArrayList;
import java.util.List;

public class CodePair1 {

    public static void main(String[] args) {

        int[] arr = new int[]{2, 9, 10, 11, -4, -5};
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 1, len = arr.length, lastEleInd = arr.length - 1;
        while (i < len && j < len) {
            if (arr[i] < arr[j]) {
                i++;
            } else {
                if (j == lastEleInd) {
                    result.add(arr[i]);
                    i++;
                    j = i + 1; //reset condition
                    continue;
                }
            }
            j++;
        }

        //last array element doesn't have any value to compare
        result.add(arr[lastEleInd]);

        System.out.println(result);
    }
}
