import java.util.Scanner;

public class PriveNumberWithRecursive {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = kb.nextInt();

        System.out.printf("%d sayısısı asaldır %b%n :", n, PriveNumberWithRecursive.isPrime(n, 2));
    }

    static boolean isPrime (int n, int i)
    {
        if (n < 2)
            return false;

        if (n == 2)
            return true;

        if (n % 3 == 0)
            return n == 3;

        if (n % 5 == 0)
            return n == 5;

        if (n % 7 == 0)
            return n == 7;

        if (i * i > n)
            return true;

        return isPrime(n, i +1);


    }
}
