package Arrays;
import java.util.Scanner;

import static Arrays.matrisTranspose.printMatrix;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = { { 2, 3, 4 }, { 5, 6, 4 } };
        System.out.println("Matris");
        printMatrix(matrix);
        System.out.println("Transpose");
        printMatrix(matrisTranspose.transposeMatrix(matrix));
    }
}

