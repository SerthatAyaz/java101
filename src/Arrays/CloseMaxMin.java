package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CloseMaxMin {
    public static void main(String[] args) {
        int[] list = {15,12,788,1,-1,-778,2,0};
        Arrays.sort(list);

        System.out.println(Arrays.toString(list));

        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a number :");
        int number = kb.nextInt();

        for (int i = 0; i < list.length; ++i) {
            if (number < list[i]){
                System.out.println("Close min :" + list[i -1]);
                System.out.println("close max :" + list[i]);
                break;
            }
        }

    }
}
