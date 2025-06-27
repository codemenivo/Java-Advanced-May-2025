package Mini_Projects.Students_And_Drades;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numbersOfLine = Integer.parseInt(scanner.nextLine());

        List<Student> studentsList = new ArrayList<>();

        while (numbersOfLine > 0){

            String[] input = scanner.nextLine().split("\\s+");
            String name = input[0];
            double grade = Double.parseDouble(input[1]);

            Student student = new Student(name, grade);

            studentsList.add(student);

            numbersOfLine--;
        }

        // 1. Извеждане на отличницити с успех >= 5.50
        List<Student> excellentStudents = createExcelantStudentsList(studentsList);

        printExcelantStudentList(excellentStudents);

        // 2. Имена на ученици с успех под 4.00 (оценка < 4.00) и името да започва с главна буква

        List<Student> lowGradeStudent = createLowGradeStudentsList(studentsList);
        printLowGradeStudentsList(lowGradeStudent);

    }

    private static void printLowGradeStudentsList(List<Student> lowGradeStudent) {
        System.out.println("Ученици с успех под 4.00 :");
        for (Student student : lowGradeStudent) {
            System.out.println(student.getName().substring(0, 1).toUpperCase() + student.getName().substring(1) +
                    " - " + student.getGrade());

        }
    }

    private static List<Student> createLowGradeStudentsList(List<Student> studentsList) {
        return studentsList.stream()
                .filter(lowGrade -> lowGrade.getGrade() < 4.00)
                .sorted(Comparator.comparing(Student::getGrade).reversed()).toList();
    }

    private static void printExcelantStudentList(List<Student> excellentStudents) {
        System.out.println(" Отличници: ");
        for (Student student : excellentStudents) {
            System.out.println(student.getName().substring(0, 1).toUpperCase() +
                    student.getName().substring(1) + " - " + student.getGrade());
        }
    }

    private static List<Student> createExcelantStudentsList(List<Student> studentsList) {

        return studentsList.stream()
                .filter(result -> result.getGrade() >= 5.50).toList();
    }
}
