package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo_03_06_Hot_Potato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> queueKids = Arrays.stream(scanner.nextLine().split("\\s+"))
                                    .collect(Collectors.toCollection(ArrayDeque::new));

        int number = Integer.parseInt(scanner.nextLine());;

        while (queueKids.size() > 1) {
            for (int i = 1; i < number; i++) {
                String currentName = queueKids.poll();
                queueKids.offer(currentName);;
            }
            System.out.printf("Removed %s%n", queueKids.poll());
        }

        System.out.printf("Last is %s%n", queueKids.poll());

    }
}
