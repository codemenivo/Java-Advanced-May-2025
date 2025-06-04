package L02_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class P02_05_MatrixShuffling {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] size = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        int rows = size[0];
        int cols = size[1];

        String[][] matrix = new String[rows][cols];
        fillMatrix(matrix, scanner);


        List<String> inputData = new LinkedList<>();
        String currentStr = scanner.nextLine();

        while (!"END".equals(currentStr)){
            inputData = Arrays.stream(currentStr.split("\\s+")).toList();

            if ("swap".equals(inputData.get(0)) && inputData.size() == 5) {
                int pointRow1 = Integer.parseInt(inputData.get(1));
                int pointCol1 = Integer.parseInt(inputData.get(2));
                int pointRow2 = Integer.parseInt(inputData.get(3));
                int pointCol2 = Integer.parseInt(inputData.get(4));

                if (isInBounds(pointRow1, pointCol1, pointRow2, pointCol2, matrix)){

                    String swapFirst = matrix[pointRow1][pointCol1];
                    String swapSecond = matrix[pointRow2][pointCol2];

                    matrix[pointRow1][pointCol1] = swapSecond;
                    matrix[pointRow2][pointCol2] = swapFirst;

                    printMatrix(matrix);

                }else {
                    System.out.println("Invalid input!");
                }

            }else {
                System.out.println("Invalid input!");
            }

            currentStr = scanner.nextLine();
        }

        System.out.println();


    }

    private static void printMatrix(String[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%s ", matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static boolean isInBounds(int pointRow1, int pointCol1, int pointRow2, int pointCol2, String[][] matrix) {
        return pointRow1 >= 0 && pointRow1 < matrix.length && pointCol1 >= 0 && pointCol1 < matrix[pointRow1].length
                && pointRow2 >= 0 && pointRow2 < matrix.length && pointCol2 >= 0 && pointCol2 < matrix[pointRow2].length;
    }



    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row < matrix.length; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }



}
