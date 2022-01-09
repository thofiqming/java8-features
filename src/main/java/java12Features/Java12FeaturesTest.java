package java12Features;

import static java12Features.Java12FeaturesTest.Day.*;

public class Java12FeaturesTest {
    public static void main(String[] args) {
        Day day = FRIDAY;
        int result = switch (day) {
            case MONDAY, TUESDAY, FRIDAY, SUNDAY -> 6;
            case WEDNESDAY, THURSDAY, SATURDAY -> 8;
        };
        System.out.println(result);
    }

    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }
}
