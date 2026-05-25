package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo_03_05_Printer_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!"print".equals(input)) {
            if ("cancel".equals(input)) {
                if (!queue.isEmpty()) {
                    System.out.printf("Canceled %s%n", queue.poll());
                } else {
                    System.out.println("Printer is on standby");
                }

            } else {
                queue.offer(input);
            }

            input = scanner.nextLine();
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }

    }
}
