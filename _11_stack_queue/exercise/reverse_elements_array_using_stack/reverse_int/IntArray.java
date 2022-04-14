package _11_stack_queue.reverse_elements_array_using_stack.reverse_int;

public class IntArray {
    public static final int MIN = -10;
    public static final int MAX = 10;

    public int[] array(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        }
        return arr;
    }
}


