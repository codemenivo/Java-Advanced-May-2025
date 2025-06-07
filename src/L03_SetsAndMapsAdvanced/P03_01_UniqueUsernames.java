package L03_SetsAndMapsAdvanced;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P03_01_UniqueUsernames {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        Set<String> usernames = new LinkedHashSet<>();
        setUsernames(scanner, num, usernames);

        printSetUsernames(usernames);

    }

    private static void printSetUsernames(Set<String> usernames) {
        for (String username : usernames) {
            System.out.printf("%s%n", username);
        }
    }

    private static void setUsernames(Scanner scanner, int num, Set<String> usernames) {
        for (int i = 0; i < num; i++) {
            String currentName = scanner.nextLine();
            usernames.add(currentName);
        }
    }
}
