package WhileLoop_Lab;

import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String studentName = scanner.nextLine();
        Double allGrades = 0.0;
        int year = 1;
        int failedClass = 0;

        while (year <= 12) {
            Double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4.00) {
                allGrades += grade;
                year++;
            } else {
                failedClass++;
                if (failedClass > 1) {
                    System.out.printf("%s has been excluded at %d grade%n", studentName, year);
                    return;
                }
            }
        }
        double gpa = allGrades / 12;
        System.out.printf("%s graduated. Average grade: %.2f%n", studentName, gpa);

    }
}
