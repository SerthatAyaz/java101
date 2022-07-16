import java.util.Scanner;
public class IsArmstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number :");
        int number = input.nextInt();
        int countNumber = 0;
        int tempNumber = number;
        int basValue;
        int result = 0;
        int basPow;

        while (tempNumber != 0) {
            tempNumber /= 10;
            countNumber++;
        }
        tempNumber = number;
        System.out.println(countNumber + "count number");

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow  = 1;
            for (int i = 1; i <=countNumber; i++){
                basPow *= basValue;
            }

            result += basPow;
            tempNumber /= 10;

        }
        System.out.println(result);

    }
}
