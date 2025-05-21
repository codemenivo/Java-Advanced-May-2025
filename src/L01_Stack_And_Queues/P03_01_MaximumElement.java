package L01_Stack_And_Queues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class P03_01_MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        while (0 != numberOfCommands){
            String[] line = scanner.nextLine().split("\\s+");
            if (line.length == 2){
                int currentNum = Integer.parseInt(line[1]);
                stack.push(currentNum);
            } else if (line.length == 1) {
                if (line[0].equals("2")) {
                    stack.pop();
                }else {
                    System.out.println(Collections.max(stack));
                }
            }


            numberOfCommands--;
        }


    }
}
