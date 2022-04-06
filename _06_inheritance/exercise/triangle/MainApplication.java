package _06_inheritance.exercise.triangle;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter side 1:");
        double side1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter side 2:");
        double side2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter side 3:");
        double side3 = Double.parseDouble(scanner.nextLine());
        Triangle triangle = new Triangle(side1, side2, side3);
        System.out.println(triangle.toSring());
    }

}
