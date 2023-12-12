package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class InvalidNumber_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        if (100 <= num && num <= 200 || num == 0){
        } else {
            System.out.println("invalid");
        }
    }
}
