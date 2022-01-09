package servian_company;

import java.util.Arrays;

public class ClosedPaths {

    public static void main(String[] args) {
        int value = 630;
        int result = Arrays.stream(String.valueOf(value).split(""))
                .mapToInt(Integer::parseInt)
                .map(ClosedPaths::applyAsInt)
                .sum();
        System.out.println(result);

        doit(value);
    }

    public static void doit(int n) {
        int s = 0;
        while (n > 0) {
            int r = n % 10;
            if (r == 0 || r == 4 || r == 6 || r == 9){
                s = s + 1;
            } else if(r == 8){
                s = s + 2;
            }
            n = n / 10;
        }
        System.out.println(s);

    }

    private static int applyAsInt(int e) {
        if (e == 0 || e == 4 || e == 6 || e == 9) return 1;
        if (e == 8) return 2;
        return 0;
    }
}
