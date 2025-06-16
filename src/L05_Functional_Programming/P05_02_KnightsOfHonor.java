package L05_Functional_Programming;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class P05_02_KnightsOfHonor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split("\\s+");
        Consumer<String[]> printNames = array -> {
            for (String strName : array) {
                System.out.printf("Sir %s%n", strName);
            }
        };

        printNames.accept(names);

        // Втори начин

       /*
            Consumer<String> printKnightsNames = name -> System.out.println("Sir " + name);
            Arrays.stream(names).forEach(printKnightsNames);

        */

    }
}
