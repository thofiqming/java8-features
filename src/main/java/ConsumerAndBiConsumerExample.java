import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerAndBiConsumerExample {

    public static void main(String[] args) {
        Person person = new Person("Thofiq", 32, Gender.MALE);

        //Consumer
        printName.andThen(printGender).accept(person);

        //Bi consumer
        print2person.accept(person, person);
    }

    static Consumer<Person> printName = person -> System.out.println(person.getName());
    static Consumer<Person> printGender = person -> System.out.println(person.getGender());

    static BiConsumer<Person, Person> print2person =
            (p1, p2) -> System.out.println("First Person: " + p1 + " :: Next Person: " + p2);
}
