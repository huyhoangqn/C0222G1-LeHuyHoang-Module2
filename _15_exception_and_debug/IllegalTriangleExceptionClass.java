package _15_exception_and_debug;

import java.util.Scanner;

public class IllegalTriangleExceptionClass {
    public static void main(String[] args) throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        boolean isChecked = true;
        while (isChecked) {
            try {
                isChecked = false;
                System.out.println("Enter side 1 lenght");
                int side1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter side 2 lenght");
                int side2 = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter side 3 lenght");
                int side3 = Integer.parseInt(scanner.nextLine());
                if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
                    throw new IllegalTriangleException("Negative Exception");
                }
                if (((side1 + side2) < side3) || ((side2 + side3) < side1) || ((side1 + side3) < side2)) {
                    throw new IllegalTriangleException("Total Side Exception");
                }
            } catch (IllegalTriangleException e) {
                System.out.println("Enter again please");
                isChecked = true;
                System.out.println(e.getMessage());
            } catch (NumberFormatException e) {
                isChecked = true;
                System.out.println(e.getMessage() + "\nEnter again please");
            }
        }
    }
}
