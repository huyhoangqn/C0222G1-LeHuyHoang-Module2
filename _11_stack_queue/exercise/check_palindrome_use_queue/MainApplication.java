package _11_stack_queue.check_palindrome_use_queue;

import _11_stack_queue.check_brackets_instack.CheckBrackets;

import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;
class MainApplication {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();

        CheckPalindrome checkPalindrome = new CheckPalindrome();
        checkPalindrome.check(inputString);
    }
}


