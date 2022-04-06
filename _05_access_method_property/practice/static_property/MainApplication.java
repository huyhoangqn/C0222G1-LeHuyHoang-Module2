package _05_access_method_property.practice.static_property;

public class MainApplication {
    public static void main(String[] args) {
        StaticProperty car1 = new StaticProperty("Yamaha" + "\t", "Black");
        car1.disPlay();
        StaticProperty car2 = new StaticProperty("Honda" + "\t", "Yellow");
        car2.disPlay();
    }
}
