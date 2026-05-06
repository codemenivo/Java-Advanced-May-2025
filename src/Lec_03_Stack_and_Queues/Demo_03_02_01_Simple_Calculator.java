package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo_03_02_01_Simple_Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> expression = new ArrayDeque<>();

        for (int i = input.length - 1; i >= 0 ; i--) {
            expression.push(input[i]);
        }
        int result = 0;
        int num1 = Integer.parseInt(expression.pop());
        while (!expression.isEmpty()) {
            String operation = expression.pop();

            if ("+".equals(operation)) {
                result = num1 + Integer.parseInt(expression.pop());
                num1 = result;
            } else {
                result = num1 - Integer.parseInt(expression.pop());
                num1 = result;
            }
        }

        System.out.println(result);

    }


}
