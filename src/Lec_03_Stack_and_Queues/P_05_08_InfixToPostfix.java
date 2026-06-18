package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P_05_08_InfixToPostfix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        StringBuilder sb = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        for (int i = 0; i < input.length; i++) {
            String currentStr =  input[i];
            if (currentStr.equals("(")) {
                stack.push(currentStr);
            } else if (currentStr.equals(")")) {
                while (!stack.isEmpty() && !stack.peek().equals("(")) {
                    sb.append(stack.pop()).append(' ');
                }
                stack.pop(); // Изтрива "(" отварящата скоба
            } else {
                boolean flagOperator = isOperator(currentStr);
                if (flagOperator) {

                    while (!stack.isEmpty()
                            && !stack.peek().equals("(")
                            && priority(stack.peek()) >= priority(currentStr)) {
                        sb.append(stack.pop()).append(' ');
                    }
                    stack.push(currentStr);

                } else {
                    sb.append(currentStr).append(" ");
                }
            }
        }

        while (!stack.isEmpty()) {
            sb.append(stack.pop()).append(' ');
        }
        System.out.println(sb.toString().trim());

    }

    private static int priority(String currentStr) {
        if (currentStr.equals("+") || currentStr.equals("-")) {
            return 1;
        }
        if (currentStr.equals("*") || currentStr.equals("/")) {
            return 2;
        }
        return 0;
    }

    private static boolean isOperator(String currentStr) {
        return currentStr.equals("+") || currentStr.equals("-")
                || currentStr.equals("*") || currentStr.equals("/");
    }
}
