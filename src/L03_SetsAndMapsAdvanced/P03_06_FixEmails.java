package L03_SetsAndMapsAdvanced;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03_06_FixEmails {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Map<String, String> contacts = new LinkedHashMap<>();
        String input = scanner.nextLine();
        while (!"stop".equals(input)){
            String name = input;
            String email = scanner.nextLine();

            String currentEmail = email.toLowerCase();
            if (!"com".equals(currentEmail.substring(currentEmail.length() - 3)) &&
                    !"uk".equals(currentEmail.substring(currentEmail.length() - 2)) &&
                    !"or".equals(currentEmail.substring(currentEmail.length() - 2)) &&
                    !"us".equals(currentEmail.substring(currentEmail.length() - 2))){

                //  if(!email.toLowerCase().endsWith("uk") && !email.toLowerCase().endsWith("us")
                //  && !email.toLowerCase().endsWith("com"))

                contacts.put(name,email);
            }


            input = scanner.nextLine();
        }

        contacts.forEach((key, value) -> System.out.printf("%s -> %s%n", key, value));
        // contacts.entrySet().stream().forEach(e -> System.out.printf("%s -> %s", e.getKey(), e.getValue())); това
        // може да се трансформира в следният код :
        // contacts.entrySet().forEach(e -> System.out.printf("%s -> %s", e.getKey(), e.getValue())); а този код също
        // може да се трансформира в : contacts.forEach((key, value) -> System.out.printf("%s -> %s", key, value));


    }
}
