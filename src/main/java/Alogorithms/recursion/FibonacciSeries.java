package Alogorithms.recursion;

public class FibonacciSeries {

    public static void main(String[] args) {
        int n = 5, i = 0;
        while (i < 5) {
            int fibonacci = fibonacci(i);
            System.out.println(fibonacci);
            i++;
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
