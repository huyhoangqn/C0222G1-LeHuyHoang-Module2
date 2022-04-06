package _06_inheritance.exercise.circle_class_and_cylinder_class;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height, String color, double radius) {
        super(color, radius);
        this.height = height;
    }

    public double Volume() {
        return this.getArea() * height;
    }

    public String toString() {
        return "Height: " + this.height + "\t" + "    Volume:" + this.Volume() + "\t" + "   " + super.toString() + "";
    }
}


