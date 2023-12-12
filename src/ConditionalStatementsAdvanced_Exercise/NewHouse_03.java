package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowers = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        String flowerType = "";
        double price = 0;

        switch (flowers) {
            case "Roses":
                price = count * 5;
                flowerType = "Roses";
                if (count > 80) {
                    price *= 0.9;
                }
                break;
            case "Dahlias":
                price = count * 3.8;
                flowerType = "Dahlias";
                if (count > 90) {
                    price *= 0.85;
                }
                break;
            case "Tulips":
                price = count * 2.8;
                flowerType = "Tulips";
                if (count > 80) {
                    price *= 0.85;
                }
                break;
            case "Narcissus":
                price = count * 3;
                flowerType = "Narcissus";
                if (count < 120) {
                    price *= 1.15;
                }
                break;
            case "Gladiolus":
                price = count * 2.5;
                flowerType = "Gladiolus";
                if (count < 80) {
                    price *= 1.2;
                }
                break;
        }
        if (budget >= price) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", count, flowerType, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}
