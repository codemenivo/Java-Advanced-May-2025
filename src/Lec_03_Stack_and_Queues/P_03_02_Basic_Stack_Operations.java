package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P_03_02_Basic_Stack_Operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int[]numbers = Arrays.stream(input.split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int numbersToPush = numbers[0];
        int numbersToPop = numbers[1];
        int numberForCheck = numbers[2];

        String secondLine = scanner.nextLine();
        int[] numForPush = Arrays.stream(secondLine.split("\\s+"))
                                .mapToInt(Integer::parseInt)
                                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        if (numForPush.length >= numbersToPush) {
            for (int i = 0; i < numbersToPush; i++) {
                stack.push(numForPush[i]);
            }
        }

        while (numbersToPop > 0 &&!stack.isEmpty()) {
            stack.pop();
            numbersToPop--;
        }

        if (stack.isEmpty()) {
            System.out.println(0);
        } else if (stack.contains(numberForCheck)) {
            System.out.println("true");
        } else {
            System.out.println(Collections.min(stack));
        }


    }
}
