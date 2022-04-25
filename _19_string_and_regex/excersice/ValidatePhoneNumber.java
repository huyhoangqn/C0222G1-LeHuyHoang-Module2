package _19_string_and_regex.excersice;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidatePhoneNumber {
    public static void main(String[] args) {
        final String PHONENUMBER_REGEX = "^\\(\\d{2}\\)-\\(0\\d{9}\\)$";
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            boolean check = Pattern.matches(PHONENUMBER_REGEX, phoneNumber);
            if (check == true) {
                flag = false;
            }
        }
        System.out.println("Came");
    }
}
