package map;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MapLooping {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "hello");
        map.put(10, "hi");
        map.put(4, "do it right");

        //sort by key ascending
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).map(Map.Entry::getValue).forEach(System.out::println);

        //get the max key and value
        Integer maxKey = map.entrySet().stream().max(Map.Entry.comparingByKey()).get().getKey();
        System.out.println("Max Key = " + maxKey);

        String maxValue = map.entrySet().stream().max(Map.Entry.comparingByKey()).get().getValue();
        System.out.println("Max Value = " + maxValue);

        //sort map using key in descending order
        map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

        //get the last element from map after sorting
        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
                .skip(map.size() - 1)
                .forEach(e -> System.out.println(e.getKey()));

        //take elements until key value reaches 10
        map.entrySet().stream()
                .takeWhile(e -> e.getKey() != 10)
                .map(Map.Entry::getValue)
                .forEach(System.out::println);
    }
}
