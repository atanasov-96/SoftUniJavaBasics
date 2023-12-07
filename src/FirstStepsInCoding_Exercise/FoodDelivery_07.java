package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double chicken = scan.nextDouble() * 10.35;
        double fish = scan.nextDouble() * 12.4;
        double vegetarian = scan.nextDouble() * 8.15;
        double sum = chicken + fish + vegetarian;
        double desert = sum * .2;
        System.out.println(sum + desert + 2.5);
    }
}
