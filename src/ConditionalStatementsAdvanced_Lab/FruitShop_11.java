package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class FruitShop_11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        String day = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double itemPrice = 0;
        boolean error = false;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (item) {
                    case "banana":
                        itemPrice = 2.5;
                        break;
                    case "apple":
                        itemPrice = 1.2;
                        break;
                    case "orange":
                        itemPrice = 0.85;
                        break;
                    case "grapefruit":
                        itemPrice = 1.45;
                        break;
                    case "kiwi":
                        itemPrice = 2.7;
                        break;
                    case "pineapple":
                        itemPrice = 5.5;
                        break;
                    case "grapes":
                        itemPrice = 3.85;
                        break;
                    default:
                        System.out.println("error");
                        error = true;
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (item) {
                    case "banana":
                        itemPrice = 2.7;
                        break;
                    case "apple":
                        itemPrice = 1.25;
                        break;
                    case "orange":
                        itemPrice = 0.9;
                        break;
                    case "grapefruit":
                        itemPrice = 1.6;
                        break;
                    case "kiwi":
                        itemPrice = 3;
                        break;
                    case "pineapple":
                        itemPrice = 5.6;
                        break;
                    case "grapes":
                        itemPrice = 4.2;
                        break;
                    default:
                        System.out.println("error");
                        error = true;
                        break;
                }
                break;
            default:
                System.out.println("error");
                error = true;
                break;

        }
        if (!error) {
            System.out.printf("%.2f", amount * itemPrice);
        }
    }
}


