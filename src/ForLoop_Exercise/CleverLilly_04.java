package ForLoop_Exercise;

import java.util.Scanner;

public class CleverLilly_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        double savings = 0;
        int toyCount = 0;

        for (int i = 1; i <= age; i++) {
            if (i % 2 == 0) {
                savings += 10 * i / 2 - 1;
            } else {
                toyCount++;
            }
        }

        double totalMoney = savings + (toyCount * toyPrice);

        if (totalMoney >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", totalMoney - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - totalMoney);
        }
    }
}
