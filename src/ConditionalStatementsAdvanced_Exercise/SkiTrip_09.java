package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double days = Double.parseDouble(scanner.nextLine()) - 1;
        String roomType = scanner.nextLine();
        String review = scanner.nextLine();

        double totalPrice = 0.0;

        switch (roomType) {
            case "room for one person":
                totalPrice = days * 18;
                break;
            case "apartment":
                totalPrice = days * 25;
                if (days < 10){
                    totalPrice *= 0.70;
                } else if (10 <= days && days <= 15) {
                    totalPrice *= 0.65;
                } else {
                    totalPrice *= 0.50;
                }
                break;
            case "president apartment":
                totalPrice = days * 35;
                if (days < 10){
                    totalPrice *= 0.90;
                } else if (10 <= days && days <= 15) {
                    totalPrice *= 0.85;
                } else {
                    totalPrice *= 0.80;
                }
                break;
        }

        switch (review) {
            case "positive":
                totalPrice *= 1.25;
                break;
            case "negative":
                totalPrice *= 0.90;
                break;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
