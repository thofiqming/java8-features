package Alogorithms;

import com.sun.source.tree.Tree;

import java.util.Queue;

public class FibonacciMemorization {

    public static void main(String[] args) {
        int n = 5, i = 0;
        while (i < n) {
            int fib = fib(i);
            System.out.println(fib);
            i++;
        }
    }

    //0 1 1 2 3 5
    public static int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
}
