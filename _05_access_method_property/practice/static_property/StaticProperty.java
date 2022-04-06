package _05_access_method_property.practice.static_property;

public class StaticProperty {
    private String name;
    private String color;
    public static int count = 0;

    public StaticProperty(String name, String color) {
        this.name = name;
        this.color = color;
        count++;
    }

    public void disPlay() {
        System.out.println("Name: " + this.name + "\t" + "Color: " + this.color + "\t" + "Totol Sum: " + count);
    }


}
