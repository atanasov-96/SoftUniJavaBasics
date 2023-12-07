package ConditionalStatements_Lab;

import java.util.Scanner;

public class ExcellentResult_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int grade = scan.nextInt();
        switch (grade){
            case 5:
            case 6:
                System.out.println("Excellent!");
        }
    }
}
