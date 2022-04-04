package _04_class.excercise.fan;

public class Fan {
    public static final int FAST = 3;
    public static final int MEDIUM = 2;
    private static final int SLOW = 1;
    private int speed = SLOW;
    private boolean status = false;
    private double radius = 5;
    private String color = "blue";

    public Fan() {

    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getSpeed() {
        return this.speed;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
    }

    public String toString() {
        if (this.status) {
            return "speed:" + this.getSpeed() + "\t \t" + " color: " + this.getColor() + "\t \t" + " radius:" + this.getRadius() + "\t \t" + " fan is on ";
        } else {
            return "color:" + this.getColor() + "\t \t" + " radius:" + this.getRadius() + "\t \t" + " fan is off ";
        }
    }
}
