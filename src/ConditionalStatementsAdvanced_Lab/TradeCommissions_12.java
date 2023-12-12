package ConditionalStatementsAdvanced_Lab;

import java.util.Scanner;

public class TradeCommissions_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commissions = 0;
        boolean error = false;
        switch (city) {
            case "Sofia":
                if (0 <= sales && sales <= 500) {
                    commissions = sales * 0.05;
                } else if (500 < sales && sales <= 1000) {
                    commissions = sales * 0.07;
                } else if (1000 < sales && sales <= 10000) {
                    commissions = sales * 0.08;
                } else {
                    commissions = sales * 0.12;
                }
                break;
            case "Varna":
                if (0 <= sales && sales <= 500) {
                    commissions = sales * 0.045;
                } else if (500 < sales && sales <= 1000) {
                    commissions = sales * 0.075;
                } else if (1000 < sales && sales <= 10000) {
                    commissions = sales * 0.1;
                } else {
                    commissions = sales * 0.13;
                }
                break;
            case "Plovdiv":
                if (0 <= sales && sales <= 500) {
                    commissions = sales * 0.055;
                } else if (500 < sales && sales <= 1000) {
                    commissions = sales * 0.08;
                } else if (1000 < sales && sales <= 10000) {
                    commissions = sales * 0.12;
                } else {
                    commissions = sales * 0.145;
                }
                break;
            default:
                error = true;
                break;
        }
        if (error || sales < 0) {
            System.out.println("error");
        } else {
            System.out.printf("%.2f", commissions);
        }
    }
}
