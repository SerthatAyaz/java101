import java.util.Scanner;

public class GaradePointAverage {
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        double average = 0.0;

        System.out.print("Matematik notunu girin:");
        int math = kb.nextInt();

        System.out.print("Fizik notunu girin:");
        int pyhsics = kb.nextInt();

        System.out.print("Kimya notunu girin:");
        int chemistery = kb.nextInt();

        System.out.print("Türkçe notunu girin:");
        int turkish = kb.nextInt();

        System.out.print("Tarih notunu girin:");
        int history = kb.nextInt();

        System.out.print("Müzik notunu girin:");
        int music = kb.nextInt();

        average = (math + pyhsics + chemistery + turkish + history + music) / 6.0;

        System.out.printf("6 dersin ortalaması : %f%n  ", average);

        String s = (average >= 60.0) ? "Sınıfı geçti" : "Sınıfta kaldı";

        System.out.println(s);
    }
}
