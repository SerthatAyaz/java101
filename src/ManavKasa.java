import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double priceofpear = 2.14;
        double priceofapple = 3.67;
        double priceoftomato = 1.11;
        double priceofbanana = 0.95;
        double priceofaubergine = 5.00;

        Scanner kb = new Scanner(System.in);
        System.out.print("Kaç kilo armut ?");
        double pear = kb.nextDouble();

        System.out.print("Kaç kilo elma ?");
        double apple = kb.nextDouble();

        System.out.print("Kaç kilo domates ?");
        double tomato = kb.nextDouble();

        System.out.print("Kaç kilo muz ?");
        double banana = kb.nextDouble();

        System.out.print("Kaç kilo patlıcan ?");
        double aubergine = kb.nextDouble();

        double total = priceofpear * pear + priceofapple * apple + priceoftomato * tomato + priceofbanana * banana + priceofaubergine * aubergine;

        System.out.printf("toplam tutar :%.02f%n", total);

    }
}
