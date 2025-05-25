package L01_Stack_And_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P07_01_SimpleTextEditor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StringBuilder text = new StringBuilder();
        ArrayDeque<String> stack = new ArrayDeque<>();

        int num = Integer.parseInt(scanner.nextLine());

        while (num > 0){

            String[] line = scanner.nextLine().split("\\s+");
            int command = Integer.parseInt(line[0]);

            switch (command){
                case 1 :
                    stack.push(text.toString());
                    String currentStr = line[1];
                    text.append(currentStr);
                    break;

                case 2:
                    stack.push(text.toString());
                    int lastElementsToDel = Integer.parseInt(line[1]);
                    int startToDel = text.length() - lastElementsToDel;
                    text.delete(startToDel, text.length());
                    break;

                case 3:
                    int numberOfElement = Integer.parseInt(line[1]);
                    char symbol = text.charAt(numberOfElement - 1);
                    System.out.println(symbol);
                    break;
                case 4:
                    text = new StringBuilder();
                    text.append(stack.pop());

                    break;
            }


            num--;
        }

    }
}
