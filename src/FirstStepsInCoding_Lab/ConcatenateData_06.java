package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class ConcatenateData_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        String lastName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        String town = scan.nextLine();
        System.out.printf("You are %s %s, a %d-years old person from %s.", name, lastName, age, town);
    }
}
