package _11_stack_queue.check_palindrome_use_queue;

import java.util.LinkedList;
import java.util.Queue;

public class CheckPalindrome {
    public void check( String inputString){
        Queue queue = new LinkedList();
        for (int i = inputString.length()-1; i >=0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString+queue.remove();
        }
        if (inputString.equals(reverseString))
            System.out.println("is palindrome.");
        else
            System.out.println("Not is palindrome");
    }
}
