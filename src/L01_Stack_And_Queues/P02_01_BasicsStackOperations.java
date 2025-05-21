package L01_Stack_And_Queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P02_01_BasicsStackOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] firstLine = scanner.nextLine().split("\\s+");
        int numbersToPush = Integer.parseInt(firstLine[0]);
        int numbersToPop = Integer.parseInt(firstLine[1]);
        int numberToCheck = Integer.parseInt(firstLine[2]);

        String[] secondLine = scanner.nextLine().split("\\s+");
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < numbersToPush; i++) {
            int currentNum = Integer.parseInt(secondLine[i]);
            stack.push(currentNum);
        }

        if (numbersToPop <= numbersToPush){
            for (int i = 0; i < numbersToPop; i++) {
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            System.out.println(0);
        } else if (stack.contains(numberToCheck)) {
            System.out.println("true");
        }else {
            System.out.println(Collections.min(stack));
        }

    }
}
