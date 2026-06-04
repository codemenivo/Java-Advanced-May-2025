package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P_03_03_MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int operations =Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        while (operations > 0) {

            String line = scanner.nextLine();
            if (line.contains("1 ")) {
                String[] numForPush = line.split("\\s+");
                stack.push(Integer.parseInt(numForPush[1]));
            } else if (line.contains("2")) {
                stack.pop();
            } else if (line.contains("3")) {
                if (stack.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(Collections.max(stack));
                }

            }

            operations--;
        }


    }
}
