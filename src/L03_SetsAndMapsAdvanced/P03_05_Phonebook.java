package L03_SetsAndMapsAdvanced;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03_05_Phonebook {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, String> phonebook = new TreeMap<>();

        while (!"search".equals(input)){
            String name = input.split("-")[0];
            String phoneNum = input.split("-")[1];

            if (phonebook.get(name) == null){
                phonebook.put(name, phoneNum);
            }else {
                phonebook.put(name, phoneNum);
            }

            input = scanner.nextLine();
        }

        String searchName = scanner.nextLine();
        while (!"stop".equals(searchName)){
            if (phonebook.containsKey(searchName)){
                System.out.printf("%s -> %s%n", searchName, phonebook.get(searchName));
            }else {
                System.out.printf("Contact %s does not exist.%n", searchName);
            }

            searchName = scanner.nextLine();
        }

    }
}
