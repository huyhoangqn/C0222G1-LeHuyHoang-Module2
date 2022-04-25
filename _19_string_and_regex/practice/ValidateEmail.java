package _19_string_and_regex.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter email: ");
            String email = scanner.nextLine();
            String emailRegex = "^\\w+@\\w+(\\.\\w+)+$";
            boolean check = Pattern.matches(emailRegex, email);
            if (check == true) {
                flag = false;
            }
        }
        System.out.println("Came");
    }
}
