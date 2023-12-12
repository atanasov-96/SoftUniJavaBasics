package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        int groupSize = Integer.parseInt(scanner.nextLine());

        double rentPrice = 0;
        switch (season) {
            case "Spring":
                rentPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                rentPrice = 4200;
                break;
            case "Winter":
                rentPrice = 2600;
                break;
        }

        double discount = 0.0;
        if (groupSize > 0 && groupSize <= 6) {
            discount = 0.90; // 10%
        } else if (groupSize >= 7 && groupSize <= 11) {
            discount = 0.85; // 15%
        } else if (groupSize > 12) {
            discount = 0.75; // 25%
        }
        double totalPrice = rentPrice * discount;

        if (!season.equals("Autumn") && groupSize % 2 == 0) {
            totalPrice *= 0.95;
        }

        if (budget >= totalPrice) {
            System.out.printf("Yes! You have %.2f leva left.", budget - totalPrice);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", totalPrice - budget);
        }
    }
}
