package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P_03_07_SimpleTextEditor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfOperations = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("");
        ArrayDeque<String> queue = new ArrayDeque<>();

        while (numberOfOperations > 0) {

            String input = scanner.nextLine();
            if (input.charAt(0) != '4') {
                String[] st = input.split("\\s+");
                int first = Integer.parseInt(st[0]);
                switch (first) {
                    case 1:
                        String appendText = st[1];
                        sb.append(appendText);
                        stack.push(sb.toString());
                        break;
                    case 2:
                       int delLastElements = Integer.parseInt(st[1]);
                       int startIndex = sb.length() - delLastElements;
                       int lastIndex = sb.length();
                       sb.delete(startIndex, lastIndex);
                       stack.push(sb.toString());
                        break;
                    case 3:
                        int numOfElement = Integer.parseInt(st[1]);
                        System.out.println(sb.charAt(numOfElement - 1));

                        break;


                }
            } else if (input.charAt(0) == '4') {
                if (!stack.isEmpty()) {
                    stack.pop();
                    String unDo = stack.peek();
                    sb.replace(0, sb.length(), unDo);
                }
            }

            numberOfOperations--;
        }

    }
}
