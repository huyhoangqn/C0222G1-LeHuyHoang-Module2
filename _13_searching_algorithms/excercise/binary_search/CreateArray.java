package _13_searching_algorithms.excercise.binary_search;

import java.util.Arrays;

public class CreateArray {
    public int[] create(int size) {
        final int MIN = -10;
        final int MAX = 10;

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = MIN + (int) (Math.random() * ((MAX - MIN) + 1));
        }
        Arrays.sort(arr);
        return arr;
    }
}
