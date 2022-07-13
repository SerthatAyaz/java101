import java.util.Scanner;
public class Offer {
    public static void main(String[] args) {
        int tempature ;
        Scanner kb = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz :");
        tempature = kb.nextInt();

        String s = (tempature < 5) ? "Kayak yapanbilirsim" : (( 5 <=tempature && tempature <15 ) ? "Sinemaya gidebilirsin " :
                ((15 <= tempature && tempature < 25) ? "Piknik yapabilirsin" : "Yüzebilirsin"));

        System.out.println(s);

    }
}
