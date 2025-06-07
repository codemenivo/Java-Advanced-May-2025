package L03_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P03_02_SetsOfElements {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] sizes = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int firstSize = sizes[0];
        int secondSizes = sizes[1];

        Set<String> setNumber1 = new LinkedHashSet<>();
        Set<String> setNumber2 = new LinkedHashSet<>();

        fillTheSet(scanner, firstSize, setNumber1);
        fillTheSet(scanner, secondSizes, setNumber2);

        /*for (int i = 1; i <= countElementsFirstSet + countElementsSecondSet; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            if(i <= countElementsFirstSet){
                firstSet.add(currentNumber);
            }else {
                secondSet.add(currentNumber);
            }
        }*/

        for (String setElement : setNumber1) {
            if (setNumber2.contains(setElement)){
                System.out.printf("%s ", setElement);
            }
        }

        /*
        firstSet.retainAll(secondSet);//оставя всички елементи от първия сет, които се съдържат във втория
        firstSet.forEach(element -> System.out.print(element + " "));
         */

    }

    private static void fillTheSet(Scanner scanner, int setSize, Set<String> setCurrentNumber) {
        for (int i = 0; i < setSize; i++) {
            setCurrentNumber.add(scanner.nextLine());
        }
    }
}
