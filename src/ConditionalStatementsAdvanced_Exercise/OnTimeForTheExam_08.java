package ConditionalStatementsAdvanced_Exercise;

import java.util.Scanner;

public class OnTimeForTheExam_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMinutes = Integer.parseInt(scanner.nextLine());
        int arrivalHour = Integer.parseInt(scanner.nextLine());
        int arrivalMinutes = Integer.parseInt(scanner.nextLine());

        int examTime = examHour * 60 + examMinutes;
        int arrivalTime = arrivalHour * 60 + arrivalMinutes;
        int difference = Math.abs(examTime - arrivalTime);
        int minutes = difference % 60;
        int hours = difference / 60;

        if (examTime < arrivalTime) {
            System.out.println("Late");
            if (difference < 60) {
                System.out.printf("%d minutes after the start", difference);
            } else {
                System.out.printf("%d:%02d hours after the start", hours, minutes);
            }
        } else if (difference <= 30) {
            System.out.println("On Time");
            if (difference > 0) {
                System.out.printf("%d minutes before the start", difference);
            }
        } else {
            System.out.println("Early");
            if (hours > 0){
                System.out.printf("%d:%02d hours before the start", hours, minutes);
            } else {
                System.out.printf("%d minutes before the start", minutes);
            }
        }
    }
}
