package ConditionalStatements_Lab;

import java.util.Scanner;

public class SpeedInfo_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double n = scan.nextDouble();
        if (n <= 10) {
            System.out.println("slow");
        } else if (n > 10 && n <= 50) {
            System.out.println("average");
        } else if (n > 50 && n <= 150) {
            System.out.println("fast");
        } else if (n > 150 && n <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
