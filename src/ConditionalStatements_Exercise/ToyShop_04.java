package ConditionalStatements_Exercise;

import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double price = Double.parseDouble(scanner.nextLine());
        int puzzlesCount = Integer.parseInt(scanner.nextLine());
        int dollsCount = Integer.parseInt(scanner.nextLine());
        int bearsCount = Integer.parseInt(scanner.nextLine());
        int minionsCount = Integer.parseInt(scanner.nextLine());
        int trucksCount = Integer.parseInt(scanner.nextLine());
        int totalCount = puzzlesCount + dollsCount + bearsCount + minionsCount + trucksCount;

        double puzzles = 2.6 * puzzlesCount;
        double dolls = 3 * dollsCount;
        double bears = 4.1 * bearsCount;
        double minions = 8.2 * minionsCount;
        double trucks = 2 * trucksCount;
        double totalprice = puzzles + dolls + bears + minions + trucks;
        totalprice = totalprice - (totalprice * 0.1);

        if (totalCount >= 50) {
            totalprice = totalprice - (totalprice * 0.25);
        }
        if (totalprice < price) {
            System.out.printf("Not enough money! %.2f lv needed.\n" , price - totalprice);
        } else {
            System.out.printf("Yes! %.2f lv left.\n", totalprice - price);
        }
    }
}
