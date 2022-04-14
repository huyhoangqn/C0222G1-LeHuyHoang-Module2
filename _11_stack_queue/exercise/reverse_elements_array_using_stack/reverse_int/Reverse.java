package _11_stack_queue.reverse_elements_array_using_stack.reverse_int;

import java.util.Arrays;
import java.util.Stack;

public class Reverse {

    public void reverse(int[] arr) {
        Stack<Integer> stackList = new Stack<>();

        for (int element : arr) {
            stackList.push(element);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = stackList.pop();
        }
        System.out.print("Array after reverse:  ");
        System.out.println(Arrays.toString(arr));
    }
}
