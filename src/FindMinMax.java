import java.util.Scanner;

public class FindMinMax {
    public static void main(String[] args) {
        int maxValue = 1;
        int minValue = 1;
        Scanner kb = new Scanner(System.in);

        System.out.print("kaç tane sayı girmek istersiniz :");
        int count = kb.nextInt();

        for (int i = 1; i <= count; ++i) {
            System.out.print(i + ". sayıyı giriniz :");
            int number = kb.nextInt();

            if (i == 1) {
                maxValue = number;
                minValue = number;
            }

            if (number < minValue) {
                minValue = number;
            }

            if (number > maxValue) {
                maxValue = number;
            }
        }

        System.out.println("Min value :" + minValue);
        System.out.println("Max value : " + maxValue);
        System.out.println();
    }

}
