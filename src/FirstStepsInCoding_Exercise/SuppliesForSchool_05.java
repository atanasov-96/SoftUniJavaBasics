package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class SuppliesForSchool_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double pens = scan.nextDouble() * 5.8;
        double markers = scan.nextDouble() * 7.2;
        double cleaner = scan.nextDouble() * 1.2;
        double discount = scan.nextDouble() / 100;
        double sum = pens+ markers+ cleaner;
        System.out.println(sum - sum * discount);
    }
}
