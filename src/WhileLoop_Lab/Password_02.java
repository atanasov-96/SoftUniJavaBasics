package WhileLoop_Lab;

import java.util.Scanner;

public class Password_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        String password = scanner.nextLine();
        while (true) {
            String enterPassword = scanner.nextLine();
            if (enterPassword.equals(password)) {
                System.out.println("Welcome " + username + "!");
                break;
            }
        }
    }
}
