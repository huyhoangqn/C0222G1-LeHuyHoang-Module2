package _11_stack_queue.reverse_elements_array_using_stack.reverse_string;

import java.util.Stack;

public class Reverse {
    public String[] reverse(String[] string) {
        Stack<String> stackList = new Stack<>();

        for (String element : string) {
            stackList.push(element);
        }
        for (int i = 0; i < string.length; i++) {
            string[i] = stackList.pop();
        }
        return string;
    }
}
