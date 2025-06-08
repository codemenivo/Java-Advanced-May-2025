package L03_SetsAndMapsAdvanced;

import java.util.*;

public class P03_07_HandsOfCards {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, Set<String>> players = new LinkedHashMap<>();

        String input = scanner.nextLine();

        while (!"JOKER".equals(input)){

            String playerName = input.split(":\\s+")[0];
            String drawedCards = input.split(":\\s+")[1];
            String[] cards = drawedCards.split(",\\s+");

            Set<String> cardsSet = new HashSet<>();
            cardsSet.addAll(Arrays.asList(cards));

            if (!players.containsKey(playerName)){
                players.put(playerName, cardsSet);
            }else {
                Set<String> currentCards = players.get(playerName);
                currentCards.addAll(cardsSet);
                players.put(playerName, currentCards);
            }

            input=scanner.nextLine();
        }

        players.entrySet().forEach(entry -> {
            String name = entry.getKey();
            Set<String> cards = entry.getValue();

            int points = calculateCardsPoints(cards);

            System.out.printf("%s: %d%n", name, points);
        });

    }

    private static int calculateCardsPoints(Set<String> cards) {

        Map<Character, Integer> symbolValues = getSymbolValues();

        int sumPoints = 0;

        for (String card : cards) {
            int currentCardPoints = 0;
            if (card.startsWith("10")){
                char cardType = card.charAt(2);
                currentCardPoints = 10 * symbolValues.get(cardType);
            }else {
                char power = card.charAt(0);
                char type = card.charAt(1);

                currentCardPoints = symbolValues.get(power) * symbolValues.get(type);
            }
            sumPoints += currentCardPoints;
        }

        return sumPoints;
    }

    private static Map<Character, Integer> getSymbolValues() {

        Map<Character, Integer> characterValues = new HashMap<>();

        characterValues.put('2', 2);
        characterValues.put('3', 3);
        characterValues.put('4', 4);
        characterValues.put('5', 5);
        characterValues.put('6', 6);
        characterValues.put('7', 7);
        characterValues.put('8', 8);
        characterValues.put('9', 9);
        characterValues.put('J', 11);
        characterValues.put('Q', 12);
        characterValues.put('K', 13);
        characterValues.put('A', 14);
        characterValues.put('S', 4);
        characterValues.put('H', 3);
        characterValues.put('D', 2);
        characterValues.put('C', 1);

        return characterValues;
    }
}
