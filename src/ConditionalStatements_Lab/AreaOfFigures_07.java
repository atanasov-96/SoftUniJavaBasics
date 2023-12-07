package ConditionalStatements_Lab;

import java.util.Scanner;

public class AreaOfFigures_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();

        switch (figure) {
            case "square":
                double side = scan.nextDouble();
                System.out.printf("%.3f", side * side);
                break;
            case "rectangle":
                double sideA = scan.nextDouble();
                double sideB = scan.nextDouble();
                System.out.printf("%.3f", sideA * sideB);
                break;
            case "circle":
                double radius = scan.nextDouble();
                System.out.printf("%.3f", radius * radius * Math.PI);
                break;
            case "triangle":
                double length = scan.nextDouble();
                double height = scan.nextDouble();
                System.out.printf("%.3f", (length * height) / 2);
                break;
        }
    }
}
