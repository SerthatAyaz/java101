import java.util.Scanner;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("n1 sayısını giriniz :");
        int n1 = kb.nextInt();

        System.out.print("n2 sayısını giriniz :");
        int n2 = kb.nextInt();
        int ekok = 0;
        int i = n1;

        while (n1 > 0) {
            if ((n1 % i == 0) && (n2 % i == 0)) {
                System.out.println("Ebob :" + i);
                break;
            }else
                i--;
        }

        while (n1 > 0 && n2 > 0) {
            ekok = ( n1 * n2) / i;
            System.out.print("ekok:" + ekok);
            break;
        }
    }



}
