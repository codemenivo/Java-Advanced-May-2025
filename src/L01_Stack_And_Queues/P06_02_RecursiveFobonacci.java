package L01_Stack_And_Queues;

import java.util.Scanner;

public class P06_02_RecursiveFobonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        long first = 0;
        long second = 1;
        long third = first + second;

        for (int i = 0; i < num; i++) {
            first = second;
            second = third;
            third = first + second;
        }

        System.out.println(first);

    }
}
