import java.util.Scanner;
public class Combination {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int nTotal = 1, rTotal = 1;
        int dist = 0;
        System.out.print("Enter n number : ");
        int n = kb.nextInt();

        System.out.print("Enter r number : ");
        int r = kb.nextInt();

        if (n >= r){
            for (int i = 1; i <=n; ++i){
                nTotal *=i;
            }
            for (int i = 1; i <= r; ++i){
                rTotal *= i;
            }
            dist = n - r;
            for (int i = 1; i <= dist; ++i ){
                dist *= i;
            }

            int combination = nTotal / (rTotal * dist);

            System.out.println(combination);
        }else {
            System.out.print("You entered the wrong number");
        }

    }
}
