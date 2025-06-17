package L05_Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05_05_ReversAndExclude {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());
        int numToDivide = Integer.parseInt(scanner.nextLine());

        Collections.reverse(numbers);

        Predicate<Integer> checkDivision = number -> number % numToDivide == 0;
        numbers.removeIf(checkDivision);

       /* for (Integer number : numbers) {
            System.out.printf("%d ", number);
        }

        */
        numbers.forEach(nuber -> System.out.printf("%d ", nuber));



    }
}
