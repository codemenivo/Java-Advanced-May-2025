package L05_Functional_Programming;

import java.util.Scanner;
import java.util.function.Consumer;

public class P05_01_ConsumerPrint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");

        Consumer<String[]> printNames = array -> {
            for (String str : array) {
                System.out.println(str);
            }
        };

        printNames.accept(names);

    }
}
