import java.util.Scanner;

public class IsPalindrom {
    public static void main(String[] args) {
        PalindromApp.run();
    }

class PalindromApp {
    public static void run() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int n = kb.nextInt();
        if (n == 0)
            return;

        System.out.println(Palindrom.Palindromis(n));


    }
class Palindrom {
    static boolean Palindromis(int number) {
        int temp = number, reverseNumber = 0, lastNumber;

        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (number == reverseNumber){
            System.out.println(number + "  Polindrom bir sayididr");
            return true;
        }
        else {
            System.out.println(number+"  Polindrom sayi degildir");
            return false;
        }


    }
}

}



}
