package Alogorithms.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class SherlockString {

    public static void main(String[] args) {
        String str = "abcdefghhgfedecba";
        String sherlockString = isSherlockString(str);
        System.out.println(sherlockString);
    }

    public String isSherLock(String str){
        double result = Math.pow(10, 5);
        if(str.length() > result){
            return "NO";
        }
        return isSherlockString(str);
    }

    private static String isSherlockString(String str) {
        boolean isValid = verifyString(str);
        if (isValid) {
            return "YES";
        }

        int i = 0;
        while (i < str.length()) {
            boolean checkValid = verifyString(str.substring(0, i) + str.substring(i + 1));
            if (checkValid) {
                return "YES";
            }
            i++;
        }

        return "NO";
    }

    private static boolean verifyString(String str) {
        int i = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (i < str.length()) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
            i++;
        }
        Optional<Map.Entry<Character, Integer>> reduce =
                map.entrySet().stream().reduce((a, b) -> {
                    if (Objects.equals(a.getValue(), b.getValue())) {
                        return Map.entry('x', a.getValue());
                    } else {
                        return Map.entry('x', -1);
                    }
                });
        return reduce.get().getValue() != -1;
    }
}
