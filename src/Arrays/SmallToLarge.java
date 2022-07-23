package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SmallToLarge {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.print("Dizi kaç elemanlı ?");
        int len = kb.nextInt();
        int[] list = new int[len];
        System.out.println("Dizi elemanlarını giriniz :");

        for (int i = 0; i < list.length; i++) {
            System.out.print((i + 1) + ".Eleman :");
            list[i] = kb.nextInt();
        }

        System.out.println("Sıralama :" + Arrays.toString(list));
        Arrays.sort(list);
        System.out.print("Sıralanan dizi :");
        System.out.println("Sıralama :" + Arrays.toString(list));


    }
}
