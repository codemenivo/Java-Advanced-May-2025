package L05_Functional_Programming;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P05_04_AppliedArithmetic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scanner.nextLine();

        while (!"end".equals(command)){
            switch (command){
                case "add":
                    Function<List<Integer>, List<Integer>> increaseNumbersInList = list -> list.stream()
                            .map(number -> number += 1).collect(Collectors.toList());
                    numbers = increaseNumbersInList.apply(numbers);
                    break;
                case "multiply":
                    Function<List<Integer>, List<Integer>> multiplyNumbersInList = list -> list.stream()
                            .map(number -> number *= 2).collect(Collectors.toList());
                    numbers = multiplyNumbersInList.apply(numbers);
                    break;
                case "subtract":
                    Function<List<Integer>, List<Integer>> subtractNumbersInList = list -> list.stream()
                            .map(number -> number -= 1).collect(Collectors.toList());
                    numbers = subtractNumbersInList.apply(numbers);
                    break;
                case "print":
                    Consumer<List<Integer>> printNumbers = list -> {
                        for (Integer number : list) {
                            System.out.printf("%d ", number);
                        }
                    };
                    printNumbers.accept(numbers);
                    System.out.println();
                    break;
            }


            command = scanner.nextLine();
        }



    }
}
