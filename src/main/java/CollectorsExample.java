import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class CollectorsExample {

    public static void main(String[] args) {

        List<Person> people = List.of(new Person("thofiq", 34, Gender.MALE),
                new Person("test", 32, Gender.FEMALE));

        //collecting and summarizing for statistics
        IntSummaryStatistics collect = people.stream().collect(Collectors.summarizingInt(Person::getAge));
        System.out.println(collect);
    }
}
