package ConditionalStatements_Exercise;

import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int minutes = (a + b + c) / 60;
        int seconds = (a + b + c) % 60;
        System.out.printf("%d:%02d",minutes,seconds);
    }
}
