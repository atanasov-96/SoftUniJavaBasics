package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String item = scanner.nextLine();
        String town = scanner.nextLine();
        double amount = Double.parseDouble(scanner.nextLine());
        double itemPrice = 0;
        switch (town) {
            case "Sofia":
                switch (item) {
                    case "coffee":
                        itemPrice = 0.5;
                        break;
                    case "water":
                        itemPrice = 0.8;
                        break;
                    case "beer":
                        itemPrice = 1.2;
                        break;
                    case "sweets":
                        itemPrice = 1.45;
                        break;
                    case "peanuts":
                        itemPrice = 1.6;
                        break;
                }

                break;
            case "Plovdiv":
                switch (item) {
                    case "coffee":
                        itemPrice = 0.4;
                        break;
                    case "water":
                        itemPrice = 0.7;
                        break;
                    case "beer":
                        itemPrice = 1.15;
                        break;
                    case "sweets":
                        itemPrice = 1.30;
                        break;
                    case "peanuts":
                        itemPrice = 1.5;
                        break;
                }

                break;
            case "Varna":
                switch (item) {
                    case "coffee":
                        itemPrice = 0.45;
                        break;
                    case "water":
                        itemPrice = 0.7;
                        break;
                    case "beer":
                        itemPrice = 1.1;
                        break;
                    case "sweets":
                        itemPrice = 1.35;
                        break;
                    case "peanuts":
                        itemPrice = 1.55;
                        break;
                }
                break;
        }
        System.out.println(amount * itemPrice);
    }
}