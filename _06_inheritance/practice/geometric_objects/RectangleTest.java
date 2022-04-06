package _06_inheritance.practice.geometric_objects;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        rectangle = new Rectangle(3.5, 4.5);
        System.out.println(rectangle);
        rectangle = new Rectangle("Pink", false, 6.8, 9.3);
        System.out.println(rectangle);
    }
}
