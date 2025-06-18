package L05_Functional_Programming;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_08_CustomComparator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).toList();

        Comparator<Integer> customComparator = (a, b) -> {
            if (a % 2 == 0 && b % 2 != 0) {
                return -1;
            } else if (a % 2 != 0 && b % 2 == 0) {
                return 1;
            }else {
                return Integer.compare(a, b);

                // 2 начин
                //return a.compareTo(b);
            }
        };

        numbers.stream().sorted(customComparator).forEach(number -> System.out.print(number + " "));

    }
}
