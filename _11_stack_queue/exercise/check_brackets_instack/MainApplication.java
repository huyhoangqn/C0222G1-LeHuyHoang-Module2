package _11_stack_queue.check_brackets_instack;

import java.util.Scanner;
import java.util.Stack;

public class MainApplication {
    public static void main(String[] args) {
        String strExpr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a parentness: ");
        strExpr = scanner.nextLine();

        CheckBrackets check = new CheckBrackets();
        check.check(strExpr);
    }
}