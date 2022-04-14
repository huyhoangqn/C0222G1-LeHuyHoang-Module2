package _11_stack_queue.demical_to_binary_by_stack;

import java.util.Stack;

public class Convert {
    public void convertBinary(int num) {
        Stack<Integer> stack = new Stack<Integer>();

        while (num != 0) {
            int d = num % 2;
            stack.push(d);
            num /= 2;
        }

        while (!(stack.isEmpty())) {
            System.out.print(stack.pop());
        }
    }
}
