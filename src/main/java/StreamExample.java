import java.util.Collection;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamExample {
    public static void main(String[] args) {

        //Initialization of list
        List<Person> people = List.of(
                new Person("thofiq", 34, Gender.MALE),
                new Person("test2323", 18, Gender.MALE)
        );

        //convert people list to stream of int of person name and then print out to console
        people.stream()
                .map(person -> person.getName().length())
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //is list contains all male candidates
        boolean isAllMales = people.stream().allMatch(person -> person.getGender().equals(Gender.MALE));
        System.out.println(isAllMales);

        //sort the list by person name length
        people.stream()
                .sorted(Comparator.comparing(person -> person.getName().length()))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        //List of list names ==> flatmap usgae
        List<List<Person>> listOfListPeople = List.of(people);
        listOfListPeople.stream()
                .flatMap(Collection::stream)
                .forEach(System.out::println);

        int addingUpPeopleAge = people.stream()
                .map(Person::getAge)
                .reduce(Integer::sum)
                .get();

        System.out.println(addingUpPeopleAge);

        //extract statistics
        people.stream()
                .dropWhile(person -> person.getAge() > 20)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //statistics info
        IntSummaryStatistics intSummaryStatistics = people.stream().mapToInt(Person::getAge).summaryStatistics();
        System.out.println(intSummaryStatistics);

        //IntStream
        IntSummaryStatistics summaryStatistics = IntStream.of(1, 2, 3, 4, 5).summaryStatistics();
        System.out.println(summaryStatistics);
    }
}
