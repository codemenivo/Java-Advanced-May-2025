package L01_Stack_And_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class P04_01_BasicQueueOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");
        int numbersOfElements = Integer.parseInt(firstLine[0]);
        int numbersToPoll = Integer.parseInt(firstLine[1]);
        int numberToCheck = Integer.parseInt(firstLine[2]);

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(queue::offer);

        ArrayDeque<Integer> tempQueue = new ArrayDeque<>();
        if (numbersOfElements < queue.size()){
            for (int i = 0; i < numbersOfElements; i++) {

                tempQueue.offer(queue.poll());

                }

            while (0 != queue.size()){
                queue.poll();

            }

            for (Integer element : tempQueue) {
                queue.offer(element);
            }
        }

        if (queue.size() == numbersOfElements){
            for (int i = 0; i < numbersToPoll; i++) {
                queue.poll();
            }

            if (queue.size() == 0){
                System.out.println(0);
            } else if (queue.contains(numberToCheck)) {
                System.out.println("true");
            }else {
                System.out.println(Collections.min(queue));
            }
        }

    }
}
