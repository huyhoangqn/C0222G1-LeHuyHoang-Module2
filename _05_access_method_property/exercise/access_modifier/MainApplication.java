package _05_access_method_property.exercise.access_modifier;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kinh: ");
        double radius = Double.parseDouble(scanner.nextLine());

        AccessModifier circle = new AccessModifier(radius);
        circle.disPlay();
    }
}
