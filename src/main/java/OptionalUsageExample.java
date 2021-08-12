import java.util.Optional;
import java.util.stream.Stream;

public class OptionalUsageExample {

    public static void main(String[] args) {

        //Case 1
        Integer value = Optional.of(10).orElse(15);
        System.out.println(value);

        //Case 2
        Optional.empty().ifPresentOrElse(System.out::println, () -> System.out.println("default value"));

        //Case 3
        Optional.of(10).ifPresent(e -> {
            Stream.of(e).forEach(System.out::println);
        });


    }
}
