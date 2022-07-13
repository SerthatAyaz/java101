import java.util.Scanner;
public class LargestToSmallest {
    public static void main(String[] args) {
        int a, b, c;

        Scanner kb = new Scanner(System.in);

        System.out.print("A sayısını giriniz :");
        a = kb.nextInt();

        System.out.print("B sayısını giriniz :");
        b = kb.nextInt();

        System.out.print("C sayısını giriniz :");
        c = kb.nextInt();

       /* if ((a > b) && (a > c)) {
            if (b > c) {
                System.out.println("a > b > c");
            }
            else
                System.out.println("a > c > b");

        }else if ((b > a) && (b > c)) {
            if (a > c){
                System.out.println("b > a > c");
            }else {
                System.out.println("b > c > a");
            }

        }else if ((c > b) && (c > a)) {
            if (b > a){
                System.out.println("c > b > a");
            }else
                System.out.println("c > a > b");



    }
    */
        //Üsteki kodun daha iyisi allta yazılmıştır. (CSD C Ve Sistem Programcılar Derneği - Oğuz Karan hocamın kodlarından alıntı yapılmıştır..)
        int min = Math.min(Math.min(a, b), c);
        int max = Math.max(Math.max(a, b), c);
        int mid = a + b + c - min - max;

        if (min < mid)
            System.out.printf("%d < %d ", min, mid);
        else
            System.out.printf("%d = %d ", min, mid);

        if (mid < max)
            System.out.printf("< %d%n", max);
        else
            System.out.printf("= %d%n", max);
    }
}
