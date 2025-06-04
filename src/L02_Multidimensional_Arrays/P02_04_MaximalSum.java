package L02_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02_04_MaximalSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];;

        int[][] inputMatrix = new int[rows][cols];

        filInputMatrix(inputMatrix, scanner, rows);

        int maxSum = Integer.MIN_VALUE;
        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row <= rows - 3; row++) {
            for (int col = 0; col <= cols - 3; col++) {

                int currentSum = 0;
                for (int currentRow = row; currentRow < row + 3; currentRow++) {
                    for (int currentCol = col; currentCol < col + 3; currentCol++) {
                        currentSum += inputMatrix[currentRow][currentCol];
                    }
                }
                if (currentSum > maxSum){
                    maxSum = currentSum;
                    bestRow = row;
                    bestCol = col;

                }

            }

        }


        printOutput(maxSum, bestRow, bestCol, inputMatrix);


    }

    private static void printOutput(int maxSum, int bestRow, int bestCol, int[][] inputMatrix) {
        System.out.printf("Sum = %d%n", maxSum);
        for (int row = bestRow; row < bestRow + 3; row++) {
            for (int col = bestCol; col < bestCol + 3; col++) {
                System.out.printf("%d ", inputMatrix[row][col]);
            }
            System.out.println();

        }
    }




    private static void filInputMatrix(int[][] inputMatrix, Scanner scanner, int rows) {
        for (int row = 0; row < rows; row++) {
            inputMatrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();

        }
    }
}
