package _06_inheritance.exercise.point2d_point3d;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x");
        float x = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap y");
        float y = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhap z");
        float z = Float.parseFloat(scanner.nextLine());

        Point3D point = new Point3D(x, y, z);
        point.toString();
    }
}
