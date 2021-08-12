import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {

    public static void main(String[] args) {

        List<Person> people = List.of(new Person("thofiq", 34, Gender.MALE),
                new Person("test", 32, Gender.FEMALE));

        //predicate usage
        people.stream()
                .filter(person -> person.getGender().equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // age > 20 and Male
        Predicate<Person> personAgeMorethan20 = person -> person.getAge() > 20;
        Predicate<Person> personMale = person -> person.getGender().equals(Gender.MALE);
        people.stream()
                .filter(personAgeMorethan20.and(personMale))
                .collect(Collectors.toList())
                .forEach(System.out::println);


        //bi predicate test
        System.out.println(isIGreaterThanJ(40, 20));

    }

    static boolean isIGreaterThanJ(int i, int j) {
        //Bi predicate
        BiPredicate<Integer, Integer> IGreaterThanJ = (a, b) -> a > b;
        return IGreaterThanJ.test(i, j);
    }
}
