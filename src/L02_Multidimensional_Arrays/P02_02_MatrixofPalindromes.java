package L02_Multidimensional_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P02_02_MatrixofPalindromes {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] num = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int row = num[0];
        int col = num[1];

        for (char rows = 'a'; rows < 'a' + row; rows++) {
            for (char cols = rows; cols < rows + col; cols++) {
                System.out.printf("%s%s%s ", rows, cols, rows);
            }
            System.out.println();
        }


    }
}
