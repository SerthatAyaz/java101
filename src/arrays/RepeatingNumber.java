package arrays;

public class RepeatingNumber {
    public static void main(String[] args) {
        Repeating.run();
    }
}

class Repeating {
    public static void run() {
        int[] list = {2, 3, 7, 3, 4, 9, 4, 8, 9, 21, 33, 1};
        int[] dublicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list.length; j++) {
                if ((i != j)  && (list[i] == list[j])) ;
                {
                    if (isFind(dublicate, list[i])) {
                        dublicate[startIndex++] = list[i];
                    }

                    break;
                }
            }
        }

    }

    public static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if ((value != 0) && (value % 2 == 0)) {
                System.out.print(value + " ");
                return true;
            }
        }
        return false;
    }
}

