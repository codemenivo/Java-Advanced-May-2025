package L02_Multidimensional_Arrays;

import java.util.Scanner;

public class P02_01_FillTheMatrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        int sizeMatrix = Integer.parseInt(input[0]);
        String pattern = input[1];

        int[][] matrix = new int[sizeMatrix][sizeMatrix];

        if ("A".equals(pattern)){
            fillMatrixPatternA(matrix);
        } else if ("B".equals(pattern)) {
            fillMatrixPatternB(matrix);
        }

        prinMatrix(matrix);

    }

    private static void prinMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int currentnum = matrix[row][col];
                System.out.print(currentnum + " ");
            }
            System.out.println();
        }
    }

    private static void fillMatrixPatternB(int[][] matrix) {
        int currentNum = 1;
        for (int col = 0; col < matrix.length; col++) {
            if (col % 2 == 0){
                for (int row = 0; row < matrix.length; row++) {
                    matrix[row][col] = currentNum++;
                }
            }else {
                for (int row = matrix.length - 1; row >= 0 ; row--) {
                    matrix[row][col] = currentNum++;
                }
            }
        }
    }

    private static void fillMatrixPatternA(int[][] matrix) {
        int currentNum = 1;
        for (int col = 0; col < matrix.length; col++) {
            for (int row = 0; row < matrix.length; row++) {
                matrix[row][col] = currentNum++;
            }

        }
    }


}
