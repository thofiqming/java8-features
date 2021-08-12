import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionAndBiFunctionExample {

    public static void main(String[] args) {
        //Function
        Integer output = incrementBy1.andThen(multiplyBy10).apply(2); //increment by 1 and then multiply by 10
        System.out.println(output);
        Integer composeCheck = incrementBy1.compose(multiplyBy10).apply(10);
        System.out.println(composeCheck);

        //BiFunction : increment by 1 and multiply by given number
        Integer output1 = incrementBy1AndmultiplyByNumber.apply(1, 10);
        System.out.println(output1);
    }

    static Function<Integer, Integer> incrementBy1 = value -> value + 1;
    static Function<Integer, Integer> multiplyBy10 = value -> value * 10;
    static BiFunction<Integer, Integer, Integer> incrementBy1AndmultiplyByNumber = (i, j) -> (i + 1) * j;

}
