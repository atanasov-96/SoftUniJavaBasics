package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double nylon = (scan.nextDouble() + 2) * 1.5;
        double paint = scan.nextDouble() * 14.5;
        double paintThinner = scan.nextDouble() * 5;
        double hours = scan.nextDouble();
        double sum = nylon + (paint + paint * 0.1) + paintThinner + 0.4;
        double work = (sum * 0.3) * hours;
        System.out.println(sum + work);
    }
}
