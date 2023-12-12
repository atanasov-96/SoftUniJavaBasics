package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class NumberInRange_06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > -101 && num < 101 && num != 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}


