import java.util.*;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {47, 51, 12, 242, 31, 675, 43, 245}; 
        insertionSort(arr);
        System.out.println(Arrays.toString(arr)); 
    }

    // Function to perform insertion sort on the given array
    static void insertionSort(int[] arr) {
        int n = arr.length; 
        
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                // If the current element is less than the previous element, swap them
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break; // Exit the inner loop if the current element is in the correct position
                }
            }
        }
    }

    //  function to swap two elements in the array
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first]; 
        arr[first] = arr[second]; 
        arr[second] = temp; 
    }
}
