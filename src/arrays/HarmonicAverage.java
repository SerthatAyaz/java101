package arrays;

public class HarmonicAverage {
    public static void main(String[] args) {
        int[] list = {4, 5, 6, 7, 8, 9};

        double sum = 0;

        for (double i : list) {
            sum += 1 / i;
        }

        double average = list.length / sum;

        System.out.println(average);
    }
}
