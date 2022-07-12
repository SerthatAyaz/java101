import java.util.Scanner;
public class TriangleArea {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("a kenarını giriniz :");
        double a = kb.nextDouble();

        System.out.print("b kenarını giriniz :");
        double b = kb.nextDouble();

        System.out.print("c kenarını giriniz :");
        double c = kb.nextDouble();

        double u = (a + b + c) / 2;

        double area = Math.sqrt((u * (u -a) * (u - b) * (u -c )));
        System.out.printf("üçgenin alanı: %f%n", area);
    }

}
