package FirstStepsInCoding_Exercise;

import java.util.Scanner;

public class RadiansToDegrees_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double radian = scan.nextDouble();
        double degrees = radian * 180 / Math.PI;
        System.out.println(degrees);
    }
}
