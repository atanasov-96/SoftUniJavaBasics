package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yearlyPrice = scan.nextInt();
        double sneakers = yearlyPrice * .6;
        double jersey = sneakers * .8;
        double basketball = jersey / 4;
        double accesorries = basketball / 5;
        double sum = yearlyPrice + sneakers + jersey + basketball + accesorries;
        System.out.println(sum);
    }
}
