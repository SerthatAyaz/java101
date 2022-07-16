import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int n = kb.nextInt();

        int sum = 0;

        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        System.out.println(sum);
        System.out.println();
    }

}
