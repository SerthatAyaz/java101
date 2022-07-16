import java.util.Scanner;
public class IsEven {
    public static void main(String[] args) {
       Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = kb.nextInt();

        for (int i = 0; i <= n; ++i){
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
