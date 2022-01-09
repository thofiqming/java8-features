package Alogorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BalanceParenthesis {

    public static void main(String[] args) {
        String str = "[(]";
        boolean balanced = isBlanced(str);
        System.out.println(balanced);

        boolean result = isAccurateCount(str);
        System.out.println(result);

        Map<Object, Long> collect = Stream.of(1, 2, 3, 4, 5, 6, 7)
                .collect(Collectors.groupingBy(e -> e % 2 == 0, Collectors.counting()));
        System.out.println(collect);
    }

    public static boolean isAccurateCount(String str) {
        String[] split = str.split("");
        if (split.length % 2 != 0) return false;

        Map<String, Long> map = Arrays.stream(split)
                .collect(Collectors.groupingBy(e -> e, Collectors.counting()));

        int i = Objects.equals(map.get("("), map.get(")")) ? 1 : -1;
        int j = Objects.equals(map.get("{"), map.get("}")) ? 1 : -1;
        int k = Objects.equals(map.get("["), map.get("]")) ? 1 : -1;

        return i != -1 && j != -1 && k != -1;
    }

    public static boolean isBlanced(String str) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            char element = str.charAt(i);
            if (element == '[' || element == '(' || element == '{') {
                stack.push(element);
            }

            switch (element) {
                case ']' -> {
                    Character pop = stack.pop();
                    if (pop != '[') return false;
                }
                case '}' -> {
                    Character pop = stack.pop();
                    if (pop != '{') return false;
                }
                case ')' -> {
                    Character pop = stack.pop();
                    if (pop != '(') return false;
                }
            }
            i++;
        }
        return true;
    }
}
