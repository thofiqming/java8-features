package Alogorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveAdjacentDuplicate {

    public static void main(String[] args) {
        RemoveAdjacentDuplicate test = new RemoveAdjacentDuplicate();
        String result = test.solution("azxxzy");
        System.out.println(result);
    }

    public String solution(String str) {
        if (str == null) {
            return null;
        }
        List<String> chars = Arrays.stream(str.split("")).collect(Collectors.toList());
        int i = 0, j = 1;

        while (i < chars.size() && j < chars.size()) {
            if (chars.get(i).equals(chars.get(j))) {
                chars.remove(i);
                chars.remove(j - 1);
                if (i != 0 && j != 1) {
                    i = i - 1;
                    j = i + 1;
                }
            } else {
                i = i + 1;
                j = j + 1;
            }
        }
        if (chars.size() == 0) return "";
        return String.join("", chars);
    }
}
