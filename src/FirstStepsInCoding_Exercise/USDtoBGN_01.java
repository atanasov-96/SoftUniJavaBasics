package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class USDtoBGN_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double usd = Double.parseDouble(scan.nextLine());
        System.out.println(usd * 1.79549);
    }
}
