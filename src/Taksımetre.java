import java.util.Scanner;
public class Taksımetre {
    public static void main(String[] args) {

        double perKm = 2.20, total = 10;
        Scanner kb = new Scanner(System.in);

        System.out.print("Mesafeyi km cinsinden giriniz :");
        double km = kb.nextDouble();

        total += (km * perKm);

        total = (total < 20) ? 20 : total;

        System.out.printf("toplam tutar: %f%n", total);
    }
}
