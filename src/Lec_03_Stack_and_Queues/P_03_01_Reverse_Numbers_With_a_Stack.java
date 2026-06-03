package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P_03_01_Reverse_Numbers_With_a_Stack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).forEach(stack::push);
        for (String s : stack) {
            System.out.printf("%s ", s);
        }

    }

}
