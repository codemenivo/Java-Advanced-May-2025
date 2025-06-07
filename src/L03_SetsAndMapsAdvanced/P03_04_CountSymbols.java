package L03_SetsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03_04_CountSymbols {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputStr = scanner.nextLine();

        Map<Character, Integer> numOfChars = new TreeMap<>();

        for (int i = 0; i < inputStr.length(); i++) {
            char currentChar = inputStr.charAt(i);

            if (numOfChars.get(currentChar) == null){
                numOfChars.put(currentChar, 1);
            }else {
                int currentNum = numOfChars.get(currentChar) + 1;
                numOfChars.put(currentChar, currentNum);
            }
        }

        for (Character character : numOfChars.keySet()) {
            int numOfValue = numOfChars.get(character);
            System.out.printf("%s: %d time/s%n", character, numOfValue);
        }

        // numOfChars.entrySet().stream().forEach(e -> System.out.printf("%s: %d time/s%n", e.getKey(), e.getValue()));

    }
}
