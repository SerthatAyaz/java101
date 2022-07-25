import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SayıTahminOyunu {
    public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;

        System.out.println(number);

        while (right < 5) {
            System.out.println("Lütfen tahmininiz giriniz :");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("lÜTFEN 0-99 ARASINDA SAYI GİRİNİZ ");
                if (isWrong) {
                    right++;
                    System.out.println("Çok hatalı giriş yaptınız :" + (5 - right));


                } else {
                    isWin = true;
                    System.out.println("Hatalı girişte sayı füşecek");
                }


                continue;
            }
                if (selected == number) {
                    System.out.println("tebrikler, doğru tahmin :" + number);
                    isWin = true;
                    break;
                } else {
                    System.out.println("Hatalı bir sayı girdiniz ");
                    if (selected > number) {
                        System.out.println(selected + " sayısı gizli sayıdan büyüktür");
                    } else {
                        System.out.println(selected + " sayısı gizli sayıdan küçüktür");
                    }


                }
                wrong[right] = selected;
                right++;
                System.out.println("Kalan hakkı : " + (5 - right));
            }
            if (!isWin) {
                System.out.println("Kaybettiniz !");


            }


            System.out.println("Tahminleriniz :" + Arrays.toString(wrong));
        }
    }

