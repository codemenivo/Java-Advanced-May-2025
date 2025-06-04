package L02_Multidimensional_Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P02_06_StringMatrixRotation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String firstLine = scanner.nextLine();
        int degrees = Integer.parseInt(firstLine.replace("Rotate(", "")
                        .replace(")", "")) % 360;

        String inputLines = scanner.nextLine();
        List<String> text = new ArrayList<>();
        int maxLengthText = 0;

        while (!inputLines.equals("END")) {
            text.add(inputLines);
            maxLengthText = Math.max(maxLengthText, inputLines.length());

            inputLines = scanner.nextLine();
        }

        int rows = text.size();
        int cols = maxLengthText;

        char[][] matrix = new char[rows][cols];

        fillMatrix(matrix, text);

        if (degrees == 0){
            printMatrix(matrix);
        } else if (degrees == 90) {
            rotate90(matrix);
        } else if (degrees == 180) {
            rotate180(matrix);
        } else if (degrees == 270) {
            rotate270(matrix);
        }


    }

    private static void rotate270(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int col = cols - 1; col >= 0 ; col--) {
            for (int row = 0; row < rows; row++) {
                System.out.print(matrix[row][col]);
            }

            System.out.println();
        }
    }

    private static void rotate180(char[][] matrix) {
        for (int row = matrix.length - 1; row >= 0 ; row--) {
            for (int col = matrix[0].length - 1; col >= 0 ; col--) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void rotate90(char[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int col = 0; col < cols; col++) {
            for (int row = rows - 1; row >= 0 ; row--) {
                System.out.print(matrix[row][col]);;
            }
            System.out.println();
        }
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
    }

    private static void fillMatrix(char[][] matrix, List<String> text) {
        for (int row = 0; row < matrix.length; row++) {
            String word = text.get(row);

            for (int col = 0; col < matrix[row].length; col++) {
                if (col <= word.length() - 1){
                    matrix[row][col] = word.charAt(col);
                }else {
                    matrix[row][col] = ' ';
                }
            }
        }
    }
}
