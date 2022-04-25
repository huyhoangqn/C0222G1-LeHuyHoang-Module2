package _19_string_and_regex.practice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter account: ");
            String account = scanner.nextLine();
            String accountRegex = "^[_a-z0-9]{6,}$";
            boolean check = Pattern.matches(accountRegex, account);
            if (check == true) {
                flag = false;
            }
        }
        System.out.println("Came");
    }
}
