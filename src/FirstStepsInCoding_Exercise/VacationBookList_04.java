package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class VacationBookList_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = scan.nextInt();
        int pph = scan.nextInt();
        int days = scan.nextInt();
        System.out.println(pages/pph/days);
    }
}
