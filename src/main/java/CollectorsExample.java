import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsExample {

    public static void main(String[] args) {

        List<Person> people = List.of(new Person("thofiq", 32, Gender.MALE),
                new Person("test", 32, Gender.FEMALE));

        //collecting and summarizing for statistics
        IntSummaryStatistics collect = people.stream().collect(Collectors.summarizingInt(Person::getAge));
        System.out.println(collect);

        //grouping by age
        Map<Object, List<Person>> map = people.stream().collect(Collectors.groupingBy(Person::getAge));
        System.out.println(map);

        //grouping by age and set of names as output
        Map<Integer, Set<String>> ageNames = people.stream()
                .collect(Collectors
                        .groupingBy(Person::getAge,
                                Collectors.mapping(Person::getName, Collectors.toSet())));
        System.out.println(ageNames);

        Set<String> extractedNames = people.stream().map(Person::getName).collect(Collectors.toSet());
        System.out.println(extractedNames);

        //Finding duplicates
        Stream.of(1, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 7)
                .collect(Collectors.groupingBy(num -> num))
                .values().stream()
                .filter(val -> val.size() >= 2)
                .map(val -> val.get(0))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
