import java.util.Scanner;
public class ForthFifithForce {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Bir sayı giriniz :");
        int n = kb.nextInt();

        for (int i = 1; i <=n; i*=4){
            System.out.print(i + " ");
        }

        for (int i = 1; i <= n; i*= 5){
            System.out.print(i + " ");
        }
    }
}
