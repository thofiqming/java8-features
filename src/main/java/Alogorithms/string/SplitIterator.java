package Alogorithms.string;

import java.util.Arrays;
import java.util.Spliterator;

public class SplitIterator {

    public static void main(String[] args) {
        String str = "hello world";
        Spliterator<String> spliterator = Arrays.stream(str.split("")).spliterator();
        
    }
}
