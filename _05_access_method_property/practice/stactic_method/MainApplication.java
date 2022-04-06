package _05_access_method_property.practice.stactic_method;

import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int roll = Integer.parseInt(scanner.nextLine());
        String name = scanner.nextLine();
        StaticMeThod obj = new StaticMeThod(roll, name);
        obj.display();
        obj.change();
        obj.display();
    }
}
