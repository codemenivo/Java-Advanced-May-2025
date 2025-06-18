package L05_Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P05_07_FindTheSmallestElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int index = -1;
        Function<List<Integer>, Integer> getMinElement = Collections::min;
        int minNum = getMinElement.apply(numbers);
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == minNum) {
                index = i;

            }
        }
        Consumer<Integer> printIndex = numIndex -> {
            System.out.println(numIndex);
        };
        printIndex.accept(index);

        //начин 2:
       /*
            Consumer<List<Integer>> printLastIndexOfMinElement =
                list -> System.out.println(list.lastIndexOf(Collections.min(list)));
            printLastIndexOfMinElement.accept(numbers);

        */

    }
}
