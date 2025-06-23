package L06_Defining_Classes.P01_OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lines = Integer.parseInt(scanner.nextLine());

        List<Person> peopleList = new ArrayList<>();

        while (lines > 0){
            String[] info = scanner.nextLine().split("\\s+");
            String name = info[0];
            int age = Integer.parseInt(info[1]);

            Person person = new Person(name, age);

            peopleList.add(person);

            lines--;
        }

        peopleList = peopleList.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());
        peopleList.sort(Comparator.comparing(person -> person.getName()));

        for (Person person : peopleList) {
            System.out.printf("%s - %d%n", person.getName(), person.getAge());
        }


    }
}
