package convertion;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayToLinkedList {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        LinkedList<Integer> linkedList = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(linkedList);
        Map<Integer, Integer> map = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.toMap(k -> k, v -> v, (old, newer) -> newer));
        System.out.println(map);
    }
}
