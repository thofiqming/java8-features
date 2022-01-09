import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeProgramming {

    public static void main(String[] args) {

        List<Person> people = List.of(new Person("thofiq", 34, Gender.MALE),
                new Person("circlescompany", 32, Gender.FEMALE));

        //Imperative style ==> declare each and every thing
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.getGender().equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        System.out.println(females);

        //Declarative style ==> you will say what you need
        people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }
}
