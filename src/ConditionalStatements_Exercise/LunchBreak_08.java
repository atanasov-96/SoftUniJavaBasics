package ConditionalStatements_Exercise;

import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String show = scanner.nextLine();
        int length = Integer.parseInt(scanner.nextLine());
        int lunchBreak = Integer.parseInt(scanner.nextLine());
        double foodTime = lunchBreak * 0.125;
        double leisureTime = lunchBreak * 0.25;
        double timeLeft = lunchBreak - (foodTime + leisureTime);
        if (length <= timeLeft) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", show, Math.ceil(timeLeft - length));
        } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", show, Math.ceil(length - timeLeft));
        }
    }
}
