package L01_Stack_And_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_01_ReverseNumbersWithAStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        for (String sim : input) {
            stack.push(sim);
        }

        while (stack.size() != 1){
            System.out.printf("%s ",stack.pop() );
        }
        System.out.printf("%s", stack.pop());

    }
}
