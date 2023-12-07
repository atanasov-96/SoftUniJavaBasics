package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double deposit = scan.nextDouble();
        int time = scan.nextInt();
        Double interest = scan.nextDouble() /100;
        double sum = deposit + time * (deposit * interest / 12);
        System.out.println(sum);
    }
}
