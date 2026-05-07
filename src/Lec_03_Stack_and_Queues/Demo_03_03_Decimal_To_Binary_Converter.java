package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo_03_03_Decimal_To_Binary_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (inputNum == 0) {
            System.out.println(0);
        } else {

            while (inputNum != 0) {
                int currentDigit = inputNum % 2;
                stack.push(currentDigit);
                inputNum /= 2;
            }

            while (!stack.isEmpty()) {
                System.out.printf("%d", stack.pop());
            }
            System.out.println();
        }

    }
}
