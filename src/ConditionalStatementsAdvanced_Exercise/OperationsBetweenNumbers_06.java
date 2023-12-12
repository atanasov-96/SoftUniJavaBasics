package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result;
        switch (operator) {
            case "+":
                result = num1 + num2;
                if (result % 2 == 0){
                    System.out.printf("%d + %d = %.0f - even%n",num1, num2, result);
                } else {
                    System.out.printf("%d + %d = %.0f - odd%n",num1, num2, result);
                }
                break;
            case "-":
                result = num1 - num2;
                if (result % 2 == 0){
                    System.out.printf("%d - %d = %.0f - even%n",num1, num2, result);
                } else {
                    System.out.printf("%d - %d = %.0f - odd%n",num1, num2, result);
                }
                break;
            case "*":
                result = num1 * num2;
                if (result % 2 == 0){
                    System.out.printf("%d * %d = %.0f - even%n",num1, num2, result);
                } else {
                    System.out.printf("%d * %d = %.0f - odd%n",num1, num2, result);
                }
                break;
            case "/":
                if (num1 == 0) {
                    System.out.printf("Cannot divide %d by zero", num2);
                } else if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    result = (double) num1 / num2;
                    if (result % 2 == 0){
                        System.out.printf("%d / %d = %.2f%n",num1, num2, result);
                    } else {
                        System.out.printf("%d / %d = %.2f%n",num1, num2, result);
                    }
                }
                break;
            case "%":
                if (num1 == 0) {
                    System.out.printf("Cannot divide %d by zero", num2);
                } else if (num2 == 0) {
                    System.out.printf("Cannot divide %d by zero", num1);
                } else {
                    result = num1 % num2;
                    if (result % 2 == 0){
                        System.out.printf("%d %% %d = %.0f%n",num1, num2, result);
                    } else {
                        System.out.printf("%d %% %d = %.0f%n",num1, num2, result);
                    }
                }
                break;
        }
    }
}
