package ConditionalStatements_Lab;

import java.util.Scanner;

public class Number100to200_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n < 100) {
            System.out.println("Less than 100");
        } else if (n >= 100 && n <= 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater than 200");
        }
    }
}
