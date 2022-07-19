import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int select;

        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";

        while (true){
            System.out.println(menu);
            System.out.println("Bir işlem seçiniz :");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }

            System.out.print("ilk sayı :");
            int a = scan.nextInt();
            System.out.print("ikinci sayı :");
            int b = scan.nextInt();


            switch (select) {
                case 1:
                    sum(a, b);
                    break;

                case 2:
                    minus(a, b);
                    break;

                case 3:
                    times(a, b);
                    break;

                case 4:
                    if (divided(a ,b) == 0) {
                        System.out.println("İkinci sayı sıfırdan farklı olmalıdır.");
                    }
                    divided(a, b);
                    break;

                case 5:
                    System.out.println(pow(a, b));
                    break;

                case 6:
                    System.out.println(fac(a, b));
                    break;

                case 7:
                    System.out.println(mod(a, b));
                    break;

                case 8:
                    calccircum(a, b);
                    break;

                default:
                    System.out.println("You entered an invalid transaction..");
            }
        }
        System.out.println("bye bye");

    }

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("Toplam :" + result);
        return result;
    }

    static int minus(int a, int b) {
      int result = a - b;
        System.out.println("çıkarma : " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("çarpma :" + result);
        return result;
    }

    static int divided(int a, int b) {
        if (b == 0) {
            return 0;
        }
        int result = a / b;
        System.out.println("Bölme :" + result);
        return result;
    }

    static int fac(int a, int b) {
        if (a == 0 && b == 0){
            return 0;
        }
        int resulta = 1;
        for (int i = 1; i <= a; i++) {
            resulta *= i;

        }


        System.out.println("a factrial: " + resulta);

        int resultb = 1;
        for (int i = 1; i <= b; i++) {
            resultb *=i;

        }
        System.out.println("b factrial: " + resultb);
        return resulta;

    }

    static int pow(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }

    static int mod(int a, int b) {
        return a % b;
    }

    static void calccircum(int a, int b) {
        System.out.println("circum" + (2 * (a + b)));
        System.out.println("area" + (a * b));
    }
}
