package _06_inheritance.exercise.circle_class_and_cylinder_class;

public class Circle {

    private double radius;
    private String color;

    public Circle(String color, double radius) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Color: " + this.color + "\t" + "     Radius: " + this.radius + "";
    }

}
