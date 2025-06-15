package Exam_Examples.Matrix;

import java.util.Scanner;

public class P_Matrix_01_ThroneConquering_15Dec2021 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int energyOfParis = Integer.parseInt(scanner.nextLine());
        int sizeField = Integer.parseInt(scanner.nextLine());

        char[][] matrix = new char[sizeField][];
        fillMatrix(sizeField, scanner, matrix);

        int currentParisRow = 0;
        int currentParisCol = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == 'P') {
                    currentParisRow = row;
                    currentParisCol = col;
                    break;
                }

            }

        }

        while (true) {
            String[] line = scanner.nextLine().split("\\s+");
            String direction = line[0];
            int enemyRow = Integer.parseInt(line[1]);
            int enemyCol = Integer.parseInt(line[2]);

            matrix[enemyRow][enemyCol] = 'S';
            matrix[currentParisRow][currentParisCol] = '-';

            switch (direction) {
                case "up":
                    if (currentParisRow - 1 >= 0 && energyOfParis > 0) {
                        currentParisRow = currentParisRow - 1;
                    }
                    break;
                case "down":
                    if (currentParisRow + 1 < matrix.length && energyOfParis > 0) {
                        currentParisRow++;
                    }
                    break;
                case "left":
                    if (currentParisCol - 1 >= 0 && energyOfParis > 0) {
                        currentParisCol--;
                    }
                    break;
                case "right":
                    if (currentParisCol + 1 < matrix[currentParisRow].length && energyOfParis > 0) {
                        currentParisCol++;
                    }
                    break;
            }
            energyOfParis--;

            if (energyOfParis <= 0 && matrix[currentParisRow][currentParisCol] != 'H') {
                parisDead(matrix, currentParisRow, currentParisCol);
                return;
            }

            if (matrix[currentParisRow][currentParisCol] == 'S') {
                energyOfParis -= 2;
                if (energyOfParis <= 0) {
                    parisDead(matrix, currentParisRow, currentParisCol);
                    return;
                } else {
                    matrix[currentParisRow][currentParisCol] = '-';
                }
            } else if (matrix[currentParisRow][currentParisCol] == 'H') {
                matrix[currentParisRow][currentParisCol] = '-';
                System.out.printf("Paris has successfully abducted Helen! Energy left: %d%n", energyOfParis);
                printMatrix(matrix);
                return;
            }



        }




    }

    private static void parisDead(char[][] matrix, int currentParisRow, int currentParisCol) {
        matrix[currentParisRow][currentParisCol] = 'X';
        System.out.printf("Paris died at %d;%d.%n", currentParisRow, currentParisCol);
        printMatrix(matrix);
    }

    private static void printMatrix(char[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.printf("%c", matrix[row][col]);
            }
            System.out.println();
        }
    }


    private static void fillMatrix(int sizeField, Scanner scanner, char[][] matrix) {
        for (int row = 0; row < sizeField; row++) {
            matrix[row] = scanner.nextLine().toCharArray();

        }
    }


}
