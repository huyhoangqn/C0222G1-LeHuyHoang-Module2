package _13_searching_algorithms.excercise.binary_search;

public class BinarySearch {
    public int search(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        do {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (value < arr[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        } while (left <= right);
        return -1;
    }
}
