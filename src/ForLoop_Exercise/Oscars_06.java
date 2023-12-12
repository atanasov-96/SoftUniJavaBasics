package ForLoop_Exercise;

import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actorName = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());

        int judgeCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < judgeCount; i++) {
            String judgeName = scanner.nextLine();
            double points = Double.parseDouble(scanner.nextLine());
            initialPoints += (judgeName.length() * points) / 2;

            if (initialPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!%n", actorName, initialPoints);
                return;
            }
        }
        System.out.printf("Sorry, %s you need %.1f more!%n", actorName, (1250.5 - initialPoints));
    }
}
