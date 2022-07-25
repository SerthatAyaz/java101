package arrays;
import java.util.Arrays;
public class FrequencyOfNumber {
    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] frequence = new int[array.length];

        for (int i = 0; i < array.length; i++)
            frequence[i] = 1;


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    frequence[i]++;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if ((i != j) && (array[i] == array[j])) {
                    array[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (frequence[i] > 1) {
                if (array[i] != 0)
                    System.out.println(array[i] + " sayisi " + frequence[i] + " kere tekrar edildi.");
            }
        }

        

    }
}
