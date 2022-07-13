import java.util.Scanner;
public class CourseScore {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int total = 0;
        int count = 0;
        System.out.print("Matematik notunu giriniz :");
        int math = kb.nextInt();
        if (0 <= math && math <= 100){
            total += math;
            ++count;
        }
        else
            System.out.println("geçersiz not");

        System.out.print("Türkçe notunu giriniz :");
        int turkish = kb.nextInt();
        if (0 <= turkish && turkish <= 100){
            total += turkish;
            ++count;
        }
        else
            System.out.println("geçersiz not");

        System.out.print("Fizik notunu giriniz :");
        int physics = kb.nextInt();
        if (0 <= physics && physics <= 100){
            total += physics;
            ++count;
        }
        else
            System.out.println("geçersiz not");

        System.out.print("Kimya notunu giriniz :");
        int chemistery = kb.nextInt();
        if (0 <= chemistery && chemistery <= 100){
            total += chemistery;
            ++count;
        }
        else
            System.out.println("geçersiz not");

        System.out.print("Müzik notunu giriniz :");
        int music = kb.nextInt();

        if (0 <= music && music <= 100){
            total += music;
            ++count;
        }
        else
            System.out.println("geçersiz not");

        double average = total / count;


        if (average <= 55) {
            System.out.println("Sınıfta kaldınız !");
        }
        else {
            System.out.println("Sınıfı geçtiniz :");
        }

        System.out.printf("ortalama = %f%n", average);
    }
}
