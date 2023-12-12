package ForLoop_Exercise;

import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        double totalCount = 0;
        double under200 = 0;
        double from200to399 = 0;
        double from400to599 = 0;
        double from600to799 = 0;
        double moreOrEqualTo800 = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            totalCount++;
            if (num < 200) {
                under200++;
            } else if (num <= 399) {
                from200to399++;
            } else if (num <= 599) {
                from400to599++;
            } else if (num <= 799) {
                from600to799++;
            } else {
                moreOrEqualTo800++;
            }
        }
        getPercent(under200,totalCount);
        getPercent(from200to399,totalCount);
        getPercent(from400to599,totalCount);
        getPercent(from600to799,totalCount);
        getPercent(moreOrEqualTo800,totalCount);
    }

    public static void getPercent(double part, double sum) {

        double percentage = 0;
        if (part > 0 && sum > 0) {
            percentage = (double) (part / sum) * 100;
        }

        System.out.printf("%.2f%%%n", percentage);

    }

}
