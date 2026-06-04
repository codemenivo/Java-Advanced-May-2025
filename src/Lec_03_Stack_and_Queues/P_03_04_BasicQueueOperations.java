package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P_03_04_BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        String line_1 = scanner.nextLine();
        int[] infoNum = Arrays.stream(line_1.split("\\s+"))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        int numFotAdd = infoNum[0];
        int numForPoll = infoNum[1];
        int numForCheck = infoNum[2];

        String line_2 = scanner.nextLine();
        int[] addQueue = Arrays.stream(line_2.split("\\s+"))
                                .mapToInt(Integer::parseInt)
                                .toArray();
        if (addQueue.length >= numFotAdd) {
            for (int i = 0; i < numFotAdd; i++) {
                queue.offer(addQueue[i]);
            }
       }

        while (numForPoll > 0 && !queue.isEmpty()) {
            queue.poll();
            numForPoll--;
        }

        if (queue.isEmpty()) {
            System.out.println(0);
        } else {
            if (queue.contains(numForCheck)) {
                System.out.println("true");
            } else {
                System.out.println(Collections.min(queue));
            }
        }


    }
}
