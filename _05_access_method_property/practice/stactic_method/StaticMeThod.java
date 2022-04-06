package _05_access_method_property.practice.stactic_method;

public class StaticMeThod {
    private int roll;
    private String name;
    private static String colle = "BD";

    public StaticMeThod(int r, String n) {
        this.name = n;
        this.roll = r;
    }

    public void change() {
        colle = "HH";
    }

    void display() {
        System.out.println(name + roll + colle);
    }
}
