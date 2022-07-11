import java.util.Scanner;
public class KdvCalculation {
    public static void main(String[] args) {
        double kdvrate = 0.0;

        Scanner kb = new Scanner(System.in);

        System.out.print("KDV siz fiyatı giriniz");
        double price = kb.nextDouble();

        if (price >= 0.0 && price <= 1000.0)
            kdvrate = 0.18;
        else if (price > 1000)
            kdvrate = 0.8;

        double kdvprice = price * kdvrate;
        double total = price + kdvprice;

        System.out.printf("kdvrate : %f%n", kdvrate);
        System.out.printf("toplam tutar: %f%n", total);
        System.out.printf("kdv price : %f%n", kdvprice);
    }
}
