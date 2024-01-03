package WhileLoop_Lab;

import java.util.Scanner;

public class AccountBalance_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0.0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("NoMoreMoney")) {
                break;
            }
            Double amount = Double.parseDouble(input);
            if (amount > 0) {
                System.out.printf("Increase: %.2f%n", amount);
                total += amount;
            } else {
                System.out.println("Invalid operation!");
                break;
            }
        }
        System.out.printf("Total: %.2f%n", total);
    }
}
