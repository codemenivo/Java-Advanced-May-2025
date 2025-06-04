package L02_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02_03_DiagonalDifference {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sizeMatrix = Integer.parseInt(scanner.nextLine());
        int[][] squareMatrix = new int[sizeMatrix][sizeMatrix];


            fillSquareMatrix(squareMatrix, scanner);


        int sumPrimaryDiagonal = 0;
        sumPrimaryDiagonal = calculatingSumFirstDiagonal(squareMatrix, sumPrimaryDiagonal);

        int sumSecondaryDiagonal = 0;
        sumSecondaryDiagonal = colculateSumSecondaryDiagonal(squareMatrix, sumSecondaryDiagonal);

        int differanceDiagonals = Math.abs(sumPrimaryDiagonal - sumSecondaryDiagonal);
        System.out.printf("%d", differanceDiagonals);


    }

    private static int colculateSumSecondaryDiagonal(int[][] squareMatrix, int sumSecondaryDiagonal) {
        for (int row = 0; row < squareMatrix.length; row++) {
            sumSecondaryDiagonal += squareMatrix[row][squareMatrix.length - 1 - row];
        }

        return sumSecondaryDiagonal;
    }

    private static int calculatingSumFirstDiagonal(int[][] squareMatrix, int sumPrimaryDiagonal) {
        for (int row = 0; row < squareMatrix.length; row++) {
            sumPrimaryDiagonal += squareMatrix[row][row];
        }
        return sumPrimaryDiagonal;
    }

    private static void fillSquareMatrix(int[][] squareMatrix, Scanner scanner) {

        for (int row = 0; row < squareMatrix.length; row++) {
            squareMatrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }

    }
}
