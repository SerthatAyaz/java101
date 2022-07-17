import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int n = kb.nextInt();

        for (int i = 0; i < n ; i++){

            for (int j = 0; j <=  i; j++) {
                System.out.print(" ");
            }

            for (int k = (2 * n - 1 - 2 * i); k >= 1 ; k--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
