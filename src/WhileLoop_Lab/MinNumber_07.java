package WhileLoop_Lab;

import java.util.Scanner;

public class MinNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int smallestNum = Integer.MAX_VALUE;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Stop")) {
                break;
            }
            int num = Integer.parseInt(input);
            if (smallestNum > num) {
                smallestNum = num;
            }
        }
        System.out.println(smallestNum);
    }
}
