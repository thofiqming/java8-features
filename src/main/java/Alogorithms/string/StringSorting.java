package Alogorithms.string;

import java.util.*;

public class StringSorting {

    public static void main(String[] args){
        List<String> values = Arrays.asList("two", "one");
        values.sort(String::compareTo);
        System.out.println(values);
    }
}
