package _04_class.excercise.fan;

public class MainApplication {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setRadius(30);
        fan1.setColor("Black");
        fan1.setStatus(true);
        fan1.setSpeed(Fan.FAST);

        Fan fan2 = new Fan();
        fan2.setRadius(53);
        fan2.setColor("Yellow");
        fan2.setStatus(false);
        fan2.setSpeed(Fan.MEDIUM);

        System.out.println("Information fan 1: " + fan1.toString());
        System.out.println("Information fan 2: " + fan2.toString());
    }
}
