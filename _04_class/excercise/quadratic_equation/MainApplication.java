package _04_class.excercise.quadratic_equation;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter parameter 1");
        double para1 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter parameter 2");
        double para2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter parameter 3");
        double para3 = Double.parseDouble(scanner.nextLine());

        QuadraticEquation obj = new QuadraticEquation(para1, para2, para3);

        if (obj.getDiscriminant() > 0) {
            System.out.println("Root 1: " + obj.getRoot1() + "\n");
            System.out.println("Root 2: " + obj.getRoot2() + "\n");
        } else if (obj.getDiscriminant() == 0) {
            System.out.println("Root: " + obj.getRoot3() + "\n");
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
