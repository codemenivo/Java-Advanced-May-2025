package L03_SetsAndMapsAdvanced;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class P03_03_PeriodicTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberChemicalCompounds = Integer.parseInt(scanner.nextLine());

        Set<String> chemicalElements = new TreeSet<>();

        fillTheSet(scanner, numberChemicalCompounds, chemicalElements);
        printSet(chemicalElements);

    }

    private static void printSet(Set<String> chemicalElements) {
        for (String chemicalElement : chemicalElements) {
            System.out.printf("%s ", chemicalElement);
        }
    }

    private static void fillTheSet(Scanner scanner, int numberChemicalCompounds, Set<String> chemicalElements) {
        for (int i = 0; i < numberChemicalCompounds; i++) {
            String[] currentElement = scanner.nextLine().split("\\s+");
            chemicalElements.addAll(Arrays.asList(currentElement));
        }
    }


}
