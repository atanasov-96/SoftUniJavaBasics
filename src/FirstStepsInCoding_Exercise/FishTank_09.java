package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double length = scan.nextDouble();
        double width = scan.nextDouble();
        double height = scan.nextDouble();
        double percent = scan.nextDouble() / 100;
        double volume = (length * width * height) / 1000;
        System.out.println(volume * (1 - percent));
    }
}
