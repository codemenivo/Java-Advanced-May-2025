package L01_Stack_And_Queues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08_01_InfixToPostfix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        ArrayDeque<String> numbersQueue = new ArrayDeque<>();
        ArrayDeque<String> operatorStack = new ArrayDeque<>();

        for (String s : input) {
            if (Character.isDigit(s.charAt(0)) || Character.isLetter(s.charAt(0))){
                numbersQueue.offer(s);
            }else {
                if (operatorStack.isEmpty()){
                    operatorStack.push(s);
                }else {
                    String lastOperator = operatorStack.peek();

                    switch (s){
                        case "+" :
                        case "-" :

                            if (lastOperator.equals("(")){
                                operatorStack.push(s);
                            }else {
                                numbersQueue.offer(operatorStack.pop());
                                operatorStack.push(s);;
                            }

                            break;

                        case "*" :
                        case "/" :

                            if (lastOperator.equals("*") | lastOperator.equals("/")){
                                numbersQueue.offer(operatorStack.pop());
                                operatorStack.push(s);
                            }else {
                                operatorStack.push(s);
                            }

                            break;

                        case "(" :
                            operatorStack.push(s);
                            break;

                        case ")" :

                            while (!operatorStack.peek().equals(")")) {
                                numbersQueue.offer(operatorStack.pop());
                            }
                            //Removing the non-necessary open parenthesis '('
                            operatorStack.pop();

                            break;

                    }

                }
            }
        }

        while (!numbersQueue.isEmpty()){
            System.out.println(numbersQueue.poll() + " ");
        }

        while (!operatorStack.isEmpty()){
            System.out.println(operatorStack.pop() + " ");
        }

        System.out.println();

    }
}
// Това решение дава 0 / 100 в Джъдж системата на Софт Уни - трябва да се поправи!