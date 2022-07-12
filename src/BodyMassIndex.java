import java.util.Scanner;
public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz :");
        double length = kb.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz :");
        double weight = kb.nextDouble();

        double ındex = weight / (length * length);

        System.out.printf("Vücut kitle endexiniz : %.15f%n", ındex);
    }
}
