package L01_Stack_And_Queues;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P09_01_PoisonousPlants {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        ArrayDeque<Integer> inputStack = new ArrayDeque<>();
        Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).forEach(inputStack::push);

        ArrayDeque<Integer> tempStack = new ArrayDeque<>();
        while (inputStack.size() >= 1){
            int quantityLast = inputStack.pop();
            if (inputStack.size() == 1){
                //tempStack.push();
            }
            int quantityPrev = inputStack.peek();

            if (quantityLast > quantityPrev){
                break;
            } else if (quantityLast < quantityPrev) {
                tempStack.push(quantityLast);
            }

        }

    }
}
