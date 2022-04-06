package _06_inheritance.exercise.point_class_and_moveablepoint;

public class Moveablepoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public Moveablepoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Moveablepoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public Moveablepoint() {

    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{getxSpeed(), getySpeed()};
    }

    public String toString() {
        return super.toString() +
                ", speed(" + xSpeed +
                ", " + ySpeed +
                ')';
    }

    public Moveablepoint move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}
