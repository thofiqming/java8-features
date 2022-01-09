package servian_company;

import java.util.Arrays;

public class EricaBobProblem {

    public static void main(String[] args) {
        String winner = winner("HE", "H");
        System.out.println(winner);
    }

    public static String winner(String erica, String bob) {
        int etotal = Arrays.stream(erica.split("")).mapToInt(e -> getData(e.charAt(0))).sum();
        int btotal = Arrays.stream(bob.split("")).mapToInt(e -> getData(e.charAt(0))).sum();
        return etotal > btotal ? "Erica" : (etotal == btotal ? "Tie" : "Bob");
    }

    public static int getData(Character c) {
        return c == 'E' ?  1 : (c == 'M' ? 3 : (c == 'H' ? 5 : 0));
    }
}
