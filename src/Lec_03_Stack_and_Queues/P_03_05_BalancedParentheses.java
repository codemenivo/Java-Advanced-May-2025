package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P_03_05_BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] charArray = scanner.nextLine().toCharArray();
        ArrayDeque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < charArray.length; i++) {
            char currentChar = charArray[i];
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stack.push(currentChar);
            } else {
                if (stack.isEmpty() || !machBrackets(stack.pop(), currentChar)) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");

    }

    private static boolean machBrackets(Character pop, char currentChar) {
        if (pop == '(') {
            return currentChar == ')';
        } else if (pop == '{') {
                return currentChar == '}';

        } else {
                return currentChar == ']';

        }
    }
}
