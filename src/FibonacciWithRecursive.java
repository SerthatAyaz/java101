import java.util.Scanner;

public class FibonacciWithRecursive {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    static int fib(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fib( n -1) + fib(n -2);
    }
}
