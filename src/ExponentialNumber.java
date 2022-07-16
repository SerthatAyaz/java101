import java.util.Scanner;
public class ExponentialNumber {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n, k;

        System.out.print("üssü alınacak sayı :");
        n = kb.nextInt();

        System.out.print("üs olacak sayı :");
        k = kb.nextInt();
        int total = 1;
        for (int i = 1; i<=k; ++i){
            total *= n;
        }
        System.out.println(total);
    }
}
