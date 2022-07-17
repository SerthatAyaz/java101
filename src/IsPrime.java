import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        for (int a = 2; a < 100; ++a){
              int count = 0;
              for (int j = 1; j <= a; j++) {
                  if (a % j == 0){
                      count++;
                  }
              }
              if (count == 2) {
                  System.out.print(a + " ");
              }
        }

    }
}
