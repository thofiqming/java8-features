import java.util.function.Consumer;

public class CallbackJustLikeJavaScript {

    public static void main(String[] args) {

        consume(new Person("thofiq", 28, Gender.MALE), System.out::println);

    }

    static void consume(Person person, Consumer<Person> consumer){
        if(person.getAge() > 20){
            consumer.accept(person);
        }else{
            System.out.println("person age is not greater than 20");
        }
    }
}
