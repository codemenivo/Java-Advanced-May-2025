package Lec_03_Stack_and_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Demo_03_04_Matching_Brackets {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);

       String input = scanner.nextLine();
       ArrayDeque<Integer> stack = new ArrayDeque<>();
       for (int index = 0; index < input.length(); index++) {
           char ch = input.charAt(index);
           if (ch == '(') {
               stack.push(index);
           } else if (ch == ')') {
               int startIndex = stack.pop();
               String str = input.substring(startIndex, index + 1);
               System.out.println(str);
           }
       }

    }

}
