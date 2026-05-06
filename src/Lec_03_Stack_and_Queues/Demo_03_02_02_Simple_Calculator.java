package Lec_03_Stack_and_Queues;

import com.sun.jdi.Value;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo_03_02_02_Simple_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> expression = Arrays.stream(scanner.nextLine().split("\\s+"))
                                    .collect(Collectors.toCollection(ArrayDeque::new));


        while (expression.size() > 1) {
            int num1 = Integer.parseInt(expression.pop());
            String operator = expression.pop();
            int num2 = Integer.parseInt(expression.pop());

            int result = 0;
            if ("+".equals(operator)) {
                result = num1 + num2;

            } else if ("-".equals(operator)) {
                result = num1 - num2;

            }

            expression.push(String.valueOf(result));

        }

        System.out.println(expression.peek());

    }
}
