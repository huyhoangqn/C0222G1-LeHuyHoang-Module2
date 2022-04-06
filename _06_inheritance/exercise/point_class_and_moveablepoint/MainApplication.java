package _06_inheritance.exercise.point_class_and_moveablepoint;

import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {
        Point point = new Point(2, 3);
        System.out.println(point);

        Moveablepoint moveablePoint = new Moveablepoint(2, 2, 2, 3);
        System.out.println(moveablePoint);
        System.out.println("Point:  " + Arrays.toString(moveablePoint.getXY()));
        moveablePoint.move();
        System.out.println("MoveablePoint:  " + moveablePoint);
    }
}
