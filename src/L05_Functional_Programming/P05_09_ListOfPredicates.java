package L05_Functional_Programming;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class P05_09_ListOfPredicates {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int limitNum = Integer.parseInt(scanner.nextLine());
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        Predicate<Integer> isDivisible = num -> {
            for (Integer number : numbers) {
                if (num % number != 0) {
                    return false;
                }
            }
            return true;
        };

        for (int i = 1; i <= limitNum; i++) {
            if (isDivisible.test(i)){
                queue.offer(i);
            }

        }

        while (queue.size() > 0){
            System.out.printf("%d ", queue.poll());

        }
        System.out.println();



    }
}
