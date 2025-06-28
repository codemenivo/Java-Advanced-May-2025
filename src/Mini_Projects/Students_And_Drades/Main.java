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

        // 1. Извеждане на отличницити с успех >= 5.50 && успех <= 6.00
        List<Student> excellentStudents = createExcelantStudentsList(studentsList);

        printExcelantStudentList(excellentStudents);

        // 2. Имена на ученици с успех под 4.00 (оценка >= 3.00 && оценка < 4.00) и името да започва с главна буква

        List<Student> lowGradeStudent = createLowGradeStudentsList(studentsList);
        printLowGradeStudentsList(lowGradeStudent);

        // 3. Имена на ученици със среден успех (оценка >= 4.00 && оценка < 5.50)

        List<Student> middleGradeStudent = createMiddleGradeStudentList(studentsList);
        printMiddleGradeStudentList(middleGradeStudent);

        // 4. Имена на ученици със слаби оценки (оценка >= 2.00 && оценка < 3.00)

        List<Student> poorGradeStudent = createPoorGradeStudentsList(studentsList);
        printPoorGradeStudentsList(poorGradeStudent);

        // 5. Имена на ученици със сгрешени оценки (оценка < 2.00 && оценка > 6.00)

        List<Student> wrongGradeStudent = createWrongGradeStudentsList(studentsList);


    }

    private static void printWrongGradeStudentsList(List<Student> wrongGradeStudent) {
        System.out.println(" Списък на ученици със сгрешени оценки : ");
        for (Student student : wrongGradeStudent) {
           String name = capitalizeFirstLetter(student.getName());
            System.out.println(name + " - " + student.getGrade());
        }
    }

    private static List<Student> createWrongGradeStudentsList(List<Student> studentsList) {
        return studentsList.stream()
                .filter(wrongGrade -> wrongGrade.getGrade() < 2.00 || wrongGrade.getGrade() > 6.00)
                .sorted(Comparator.comparing(Student::getGrade).reversed()).toList();
    }

    private static void printPoorGradeStudentsList(List<Student> poorGradeStudent) {
        System.out.println(" Ученици със слаби оценки : ");
        for (Student student : poorGradeStudent) {
            String name = capitalizeFirstLetter(student.getName());
            System.out.println(name + " - " + student.getGrade());
        }
    }

    private static List<Student> createPoorGradeStudentsList(List<Student> studentsList) {
        return studentsList.stream()
                .filter(poorGrade -> poorGrade.getGrade() >= 2.00 && poorGrade.getGrade() < 3.00)
                .sorted(Comparator.comparing(Student::getGrade).reversed()).toList();
    }

    private static void printMiddleGradeStudentList(List<Student> middleGradeStudent) {
        System.out.println(" Ученици с упех от 4.00 до 5.50 : ");
        for (Student student : middleGradeStudent) {
           String name = capitalizeFirstLetter(student.getName());
            System.out.println(name + " - " + student.getGrade());

        }
    }



    private static List<Student> createMiddleGradeStudentList(List<Student> studentsList) {
        return studentsList.stream()
                .filter(middleGrade -> middleGrade.getGrade() >= 4.00 && middleGrade.getGrade() < 5.50)
                .sorted(Comparator.comparing(Student::getGrade).reversed()).toList();
    }

    private static void printLowGradeStudentsList(List<Student> lowGradeStudent) {
        System.out.println(" Ученици с успех под 4.00 : ");
        for (Student student : lowGradeStudent) {
            String name = capitalizeFirstLetter(student.getName());
            System.out.println(name + " - " + student.getGrade());

        }
    }

    private static String capitalizeFirstLetter(String name) {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    private static List<Student> createLowGradeStudentsList(List<Student> studentsList) {
        return studentsList.stream()
                .filter(lowGrade -> lowGrade.getGrade() < 4.00 && lowGrade.getGrade() >= 3.00)
                .sorted(Comparator.comparing(Student::getName)).sorted(Comparator.comparing(Student::getGrade).reversed()).toList();
    }

    private static void printExcelantStudentList(List<Student> excellentStudents) {
        System.out.println(" Отличници : ");
        for (Student student : excellentStudents) {
            String name = capitalizeFirstLetter(student.getName());
            System.out.println(name + " - " + student.getGrade());
        }
    }

    private static List<Student> createExcelantStudentsList(List<Student> studentsList) {

        return studentsList.stream()
                .filter(result -> result.getGrade() >= 5.50 && 6.00 >= result.getGrade())
                .sorted(Comparator.comparing(Student::getGrade).reversed()).toList();
    }
}
