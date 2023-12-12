package ForLoop_Exercise;

import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int groupsCount = Integer.parseInt(scanner.nextLine());

        double totalPeople = 0;
        double musala = 0;
        double montBlanc = 0;
        double kilimanjaro = 0;
        double k2 = 0;
        double everest = 0;

        for (int i = 0; i < groupsCount; i++) {
            int groupSize = Integer.parseInt(scanner.nextLine());
            totalPeople += groupSize;

            if (groupSize <= 5) {
                musala += groupSize;
            } else if (groupSize <= 12) {
                montBlanc += groupSize;
            } else if (groupSize <= 25) {
                kilimanjaro += groupSize;
            } else if (groupSize <= 40) {
                k2 += groupSize;
            } else {
                everest += groupSize;
            }
        }
        getPercent(musala,totalPeople);
        getPercent(montBlanc,totalPeople);
        getPercent(kilimanjaro,totalPeople);
        getPercent(k2,totalPeople);
        getPercent(everest,totalPeople);

    }
    public static void getPercent(double part, double sum) {

        double percentage = 0;
        if (part > 0 && sum > 0) {
            percentage = (double) (part / sum) * 100;
        }
        System.out.printf("%.2f%%%n", percentage);
    }
}
