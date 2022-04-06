package _06_inheritance.practice.geometric_objects;

public class Rectangle extends Shape {
    private double width = 5.0;


    private double height = 9.0;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public String toString() {
        return "Chieu dai: " + this.width + " Chieu cao: " + this.height + " " + super.toString() + "";
    }
}
