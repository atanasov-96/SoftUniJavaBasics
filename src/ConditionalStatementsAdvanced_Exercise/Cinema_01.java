package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int col = Integer.parseInt(scanner.nextLine());
        double income = row * col;
        switch (type) {
            case "Premiere":
                income *= 12;
                break;
            case "Normal":
                income *= 7.5;
                break;
            case "Discount":
                income *= 5;
                break;
        }
        System.out.printf("%.2f leva", income);
    }
}
