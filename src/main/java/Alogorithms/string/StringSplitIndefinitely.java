package Alogorithms.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringSplitIndefinitely {

    public static void main(String[] args){

        String str = "ABCDDD";
        String[] abs = str.split("(AB)|(CD)|(ab)|(cd)", -1);
        String collect = Arrays.stream(abs).filter(e -> !e.isEmpty()).collect(Collectors.joining());
        System.out.println(collect);
    }
}
