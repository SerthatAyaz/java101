import java.util.Scanner;

public class ExponentialNumbersWithRecursive {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Tabanı giriniz :");
        int n = kb.nextInt();

        System.out.print("Üssü giriniz :");
        int m = kb.nextInt();

        System.out.println(pow(n, m));
    }

    static int result = 1;
    static int pow(int n , int m) {
        if(m == 0){
            return 1;
        }

        result *= n;
        pow(n , m -1);
        return result;
    }
}
