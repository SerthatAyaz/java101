import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int prev1 = 1, prev2 = 0, val = 0;
        System.out.print("Enter a number :");
        int n = kb.nextInt();
        System.out.print(prev2);

        for (int i = 2; i < n; ++i) {
            val = prev1 + prev2;
            System.out.print(" " + val);
            prev2 = prev1;
            prev1 = val;

        }

    }
}
