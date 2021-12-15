import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String[] args) {
        String str = "aabbslk";
        Map<String, Long> map = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        String key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println(key);

    }

}
