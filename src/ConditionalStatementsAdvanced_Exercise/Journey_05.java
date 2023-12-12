package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        double spent = 0;

        StringBuilder destination = new StringBuilder();
        StringBuilder place = new StringBuilder();

        if (budget <= 100) {
            destination.append("Bulgaria");
            switch (season) {
                case "summer":
                    spent = 0.30;
                    place.append("Camp");
                    break;
                case "winter":
                    spent = 0.70;
                    place.append("Hotel");
                    break;
            }
        } else if (budget <= 1000) {
            destination.append("Balkans");
            switch (season) {
                case "summer":
                    spent = 0.40;
                    place.append("Camp");
                    break;
                case "winter":
                    spent = 0.80;
                    place.append("Hotel");
                    break;
            }
        } else {
            destination.append("Europe");
            spent = 0.90;
            place.append("Hotel");
        }

        System.out.printf("Somewhere in %s\n" + "%s - %.2f", destination, place, budget * spent);
    }
}