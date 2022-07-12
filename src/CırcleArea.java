import java.util.Scanner;
public class CırcleArea {
    public static void main(String[] args) {
        Scanner kb =  new Scanner(System.in);
        double pi = 3.14;

        System.out.print("Dairenin yarıçapını giriniz :");
        double r = kb.nextDouble();
        System.out.print("Dilim açısını giriniz:");
        double a = kb.nextDouble();

        double alan = pi * r * r;
        double cevre = 2 * pi * 2;

        double dilim_daire_alan = (pi * r * r * a) / 360;

        System.out.printf("Dairenin alanı : %f%n", alan);
        System.out.printf("Dairenin cevresi : %f%n", cevre);
        System.out.printf("Dilim dairenin alanı : %f%n", dilim_daire_alan);
    }
}
