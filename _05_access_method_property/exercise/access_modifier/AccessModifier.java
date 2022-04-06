package _05_access_method_property.exercise.access_modifier;

public class AccessModifier {
    private double radius = 1.0;
    private String color = "red";

    public AccessModifier() {

    }

    public AccessModifier(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void disPlay() {
        System.out.println("Radius: " + this.getRadius() + "\t" + "Area: " + this.getArea());
    }
}
