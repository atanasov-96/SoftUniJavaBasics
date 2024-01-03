package WhileLoop_Lab;

import java.util.Scanner;

public class MaxNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int biggestNum = Integer.MIN_VALUE;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Stop")) {
                break;
            }
            int num = Integer.parseInt(input);
            if (biggestNum < num) {
                biggestNum = num;
            }
        }
        System.out.println(biggestNum);
    }
}
