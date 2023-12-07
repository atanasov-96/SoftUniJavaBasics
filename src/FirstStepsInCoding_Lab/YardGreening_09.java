package FirstStepsInCoding_Lab;

import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double cubicMeters = Double.parseDouble(scan.nextLine());
        double discount = cubicMeters * 7.61 * .18;
        double price = cubicMeters * 7.61 - discount;
        System.out.printf("The final price is: %.2f lv.%n", price);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
