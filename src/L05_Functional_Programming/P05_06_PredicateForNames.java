package L05_Functional_Programming;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05_06_PredicateForNames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int controlSize = Integer.parseInt(scanner.nextLine());
        List<String> names = Arrays.stream(scanner.nextLine().split("\\s+")).toList();

        Predicate<String> filterNemsBySize = name -> name.length() <= controlSize;
        names.stream().filter(filterNemsBySize).forEach(System.out::println);

        // names.forEach(name -> System.out.printf("%s%n", name));

    }
}