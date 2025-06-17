package L05_Functional_Programming;

import com.sun.source.doctree.SeeTree;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P05_03_CustomMiniFunction {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Set<Integer> numbers = new LinkedHashSet<>();
        numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toSet());

        /* int minNum = Collections.min(numbers);
        System.out.println(minNum);
        */
        Function<Set<Integer>, Integer> getMinNumInSet = setNum -> Collections.min(setNum);
        int minNum = getMinNumInSet.apply(numbers);
        System.out.println(minNum);

    }
}
