package _19_string_and_regex.excersice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClassName {
    public static void main(String[] args) {
        final String CLASSNAME_REGEX = "^[CPA]\\d{4}[GHIKLM]$";
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter class name: ");
            String className = scanner.nextLine();
            boolean check = Pattern.matches(CLASSNAME_REGEX, className);
            if (check == true) {
                flag = false;
            }
        }
        System.out.println("Came");
    }
}
