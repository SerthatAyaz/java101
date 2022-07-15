import java.util.Scanner;
public class IsLeapYear {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Enter a year");
        int year = kb.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.printf("Leapyear : %d%n ", year);
        }else {
            System.out.print("Not a leap year");
        }
    }
}
