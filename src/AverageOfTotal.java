import java.util.Scanner;
public class AverageOfTotal {
    public static void main(String[] args) {
        int total = 0;
        double count = 0;
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a number :");
        int n = kb.nextInt();

        for (int i = 1; i <= n; ++i){
            if (i % 3 == 0 && i % 4 == 0){
                total +=i;
                count++;
            }
        }
        double average = total / count;
        System.out.println(average);
        System.out.println();
    }
}
