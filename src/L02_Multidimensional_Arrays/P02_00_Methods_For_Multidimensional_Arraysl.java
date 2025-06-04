package L02_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02_00_Methods_For_Multidimensional_Arraysl {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

    }


    //метод, който проверява дали две матрици са еднакви
    //true -> ако двете матрици са еднакви
    //false -> ако двете матрици не са еднакви
    private static boolean isEqual (int[][] firstMatrix, int [][] secondMatrix) {
        //1. проверяваме дали броят на редовете им съвпада
        if (firstMatrix.length != secondMatrix.length) {
            //броя редовете им не съвпадат -> матриците не са еднакви
            return false;
        }

        //2. проверяваме дали броят на колоните им съвпада
        if (firstMatrix[0].length != secondMatrix[0].length) {
            //броя колоните им не съпадат -> матриците не са еднакви
            return false;
        }

        //3. проверим дали имат еднакво съдържание
        //двете матрици имат еднакъв брой редове и колони
        for (int row = 0; row <= firstMatrix.length - 1; row++) {
            for (int col = 0; col <= secondMatrix[0].length - 1; col++) {
                if (firstMatrix[row][col] != secondMatrix[row][col]) {
                    //различни елементи в матриците на еднакви места -> матриците не са еднакви
                    return false;
                }
            }
        }

        //броя на редовете съвпада
        //броя на колоните съвпада
        //елементите и на двете матрици съвпадат
        return true;
    }

    //метод, който пълни матрицата с данни от конзолата
    //целочислена разделени с интервал!!!!!!!!
    private static void fillMatrix(int[][] matrix, Scanner scanner) {
        for (int row = 0; row <= matrix.length - 1; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
    }

    //дробна разделени с интервал!!!!!!!
    private static void fillMatrix(double[][] matrix, Scanner scanner) {
        for (int row = 0; row <= matrix.length - 1; row++) {
            matrix[row] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToDouble(Double::parseDouble).toArray();
        }
    }

    //текстова разделени с интервал!!!!!!!
    private static void fillMatrix(String[][] matrix, Scanner scanner) {
        for (int row = 0; row <= matrix.length - 1; row++) {
            matrix[row] = scanner.nextLine().split("\\s+");
        }
    }

    //метод, който приема матрица -> изчислява и връща сумата от елементите
    private static int getSumMatrixElements (int[][] matrix) {
        int sum = 0; //сума на елементите на матрицата

        for (int row = 0; row <= matrix.length - 1; row++) {
            for (int col = 0; col <= matrix[0].length - 1; col++) {
                int currentElement = matrix[row][col];
                sum += currentElement;
            }
        }
        //обходили всички елементи и сме ги сумирали
        return sum;
    }

    //метод, който отпечатва елементите на второстепенния диагонал
    private static void printElementsOnSecondaryDiagonal(int[][] matrix) {
        //бр. редове = matrix.length
        //бр. колони = matrix[0].length

        //бр. редове = бр. колони
        for (int col = 0; col <= matrix.length - 1; col++) {
            for (int row = 0; row <= matrix[0].length - 1; row++) {
                int currentElement = matrix[row][col];
                //проверка дали елемента се намира на второстепенния диагонал диагонал
                if (row + col == matrix.length - 1) {
                    System.out.print(currentElement + " ");
                }
            }
        }
    }

    //метод, който отпечатва елементите на главния диагонал
    private static void printElementsOnPrimaryDiagonal(int[][] matrix) {
        for (int row = 0; row <= matrix.length - 1; row++) {
            for (int col = 0; col <= matrix[0].length - 1; col++) {
                int currentElement = matrix[row][col];
                //проверка дали елемента се намира на главния диагонал
                if (row == col) {
                    System.out.print(currentElement + " ");
                }
            }
        }
    }




}
