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

        printStudentList(" Отличници : ", excellentStudents);

        // 2. Имена на ученици с успех под 4.00 (оценка >= 3.00 && оценка < 4.00) и името да започва с главна буква

        List<Student> lowGradeStudent = createLowGradeStudentsList(studentsList);
        printStudentList(" Ученици с успех под 4.00 : ", lowGradeStudent);

        // 3. Имена на ученици със среден успех (оценка >= 4.00 && оценка < 5.50)

        List<Student> middleGradeStudent = createMiddleGradeStudentList(studentsList);
        printStudentList(" Ученици с упех от 4.00 до 5.50 : ", middleGradeStudent);

        // 4. Имена на ученици със слаби оценки (оценка >= 2.00 && оценка < 3.00)

        List<Student> poorGradeStudent = createPoorGradeStudentsList(studentsList);
        printStudentList(" Ученици със слаби оценки : ", poorGradeStudent);

        // 5. Имена на ученици със сгрешени оценки (оценка < 2.00 && оценка > 6.00)

        List<Student> wrongGradeStudent = createWrongGradeStudentsList(studentsList);
        printStudentList(" Списък на ученици със сгрешени оценки : ", wrongGradeStudent);


        // 6. Среден успех на класа

        double averageGrade = calculateAverageClassGrade(studentsList);
        System.out.printf("Средният успех на класа е: %.2f%n", averageGrade);

        // 7. Списък на учениците с упех 6.00, сортиран по азбучен ред.

        List<Student> topStudents = createTopStudentsList(studentsList);
        printStudentList(" Списък на ученици с успех 6.00: ", topStudents);

    }



    private static List<Student> createTopStudentsList(List<Student> studentsList) {

        return studentsList.stream().filter(topStudent -> topStudent.getGrade() == 6.00)
                .sorted(Comparator.comparing(Student::getName)).toList();
    }

    private static double calculateAverageClassGrade(List<Student> studentsList) {
        double averageResult = 0.0;
        for (Student student : studentsList) {
            averageResult += student.getGrade();
        }
        averageResult = averageResult / studentsList.size();

        return averageResult;
    }




    private static List<Student> createWrongGradeStudentsList(List<Student> studentsList) {
        return studentsList.stream()
                .filter(wrongGrade -> wrongGrade.getGrade() < 2.00 || wrongGrade.getGrade() > 6.00)
                .sorted(Comparator.comparing(Student::getGrade).reversed()).toList();
    }



    private static List<Student> createPoorGradeStudentsList(List<Student> studentsList) {
        return studentsList.stream()
                .filter(poorGrade -> poorGrade.getGrade() >= 2.00 && poorGrade.getGrade() < 3.00)
                .sorted(Comparator.comparing(Student::getGrade).reversed()).toList();
    }




    private static List<Student> createMiddleGradeStudentList(List<Student> studentsList) {
        return studentsList.stream()
                .filter(middleGrade -> middleGrade.getGrade() >= 4.00 && middleGrade.getGrade() < 5.50)
                .sorted(Comparator.comparing(Student::getGrade).reversed()).toList();
    }

    private static void printStudentList(String title, List<Student> list) {
        System.out.println(title);
        for (Student student : list) {
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
                .sorted(Comparator.comparing(Student::getGrade).reversed().thenComparing(Student::getName))
                .toList();
    }


    private static List<Student> createExcelantStudentsList(List<Student> studentsList) {

        return studentsList.stream()
                .filter(result -> result.getGrade() >= 5.50 && 6.00 >= result.getGrade())
                .sorted(Comparator.comparing(Student::getGrade).reversed()).toList();
    }
}
