import java.util.Scanner;
public class Calculater {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Birinci sayı giriniz:");
        int n1 = kb.nextInt();

        System.out.print("İkinci sayıyı giriniz :");
        int n2 = kb.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-çarpma\n4-Bölme");
        System.out.println("seçiminiz :");

        int select = kb.nextInt();

        switch (select) {
            case 1 :
                System.out.printf("%d + %d = %d%n", n1,n2, n1 + n2 );
                break;
            case 2:
                System.out.printf("%d - %d = %d%n", n1, n2, n1 - n2);
                break;
            case 3:
                System.out.printf("%d * %d = %d%n", n1, n2, n1 * n2);
                break;
            case 4:
                if (n2 != 0) {
                    System.out.printf("%d / %d = %d%n",n1,n2, n1 / n2);
                }
                else {
                    System.out.println("Sayı sıfıra bölünmez");
                }
                break;
            default:
                System.out.println("Hatalı seçim yaptınız :");
        }
    }
}
