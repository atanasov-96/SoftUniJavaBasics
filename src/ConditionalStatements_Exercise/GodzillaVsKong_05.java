package ConditionalStatements_Exercise;

import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int people = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.1;
        double clothesPrice = people * clothes;
        if (people > 150) {
            clothesPrice *= 0.9;
        }
        double totalprice = clothesPrice + decor;
        if (totalprice > budget) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.\n", totalprice - budget);
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.\n", budget - totalprice);
        }
    }
}
