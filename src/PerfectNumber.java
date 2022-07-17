import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int n = kb.nextInt();
        int total = 0;
        for (int i = n -1 ; i >= 1; --i){
            if (n % i == 0) {
                total += i;
            }
        }

        if (total == n) {
            System.out.printf("%d%n n sayısı mükemmel sayıdır.", n);
        }else {
            System.out.printf("%d%n n sayısını mükemmel sayı değildir." , n);
        }
    }
}
