package ForLoop_Exercise;

import java.util.Scanner;

public class TennisRankList_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentCount = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int tournamentPoints = 0;
        int winCount = 0;

        for (int i = 0; i < tournamentCount; i++) {
            String placing = scanner.nextLine();

            switch (placing) {
                case "W":
                    tournamentPoints += 2000;
                    initialPoints += 2000;
                    winCount++;
                    break;
                case "F":
                    tournamentPoints += 1200;
                    initialPoints += 1200;
                    break;
                case "SF":
                    tournamentPoints += 720;
                    initialPoints += 720;
                    break;
            }
        }
        int averagePoints = tournamentPoints / tournamentCount;
        double winPercentage = ((double) winCount / tournamentCount) * 100;
        System.out.println("Final points: " + initialPoints);
        System.out.println("Average points: " + averagePoints);
        System.out.printf("%.2f%%",winPercentage);
    }
}
