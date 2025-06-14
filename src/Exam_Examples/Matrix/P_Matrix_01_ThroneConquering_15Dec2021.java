package Exam_Examples.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class P_Matrix_01_ThroneConquering_15Dec2021 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int energyOfParis = Integer.parseInt(scanner.nextLine());
        int sizeField = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[sizeField][];
        fillMatrix(sizeField, scanner, matrix);

    }

    private static void fillMatrix(int sizeField, Scanner scanner, char[][] matrix) {
        for (int row = 0; row < sizeField; row++) {
            matrix[row] = scanner.nextLine().toCharArray();
        }
    }
}
