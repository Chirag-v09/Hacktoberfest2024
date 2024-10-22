import java.util.Arrays;

public class SelectionSort{
    public static void main(String[] args) {
        int[] arr = {13, 111, 51, 44, 26, 29, 101, 343, 91};
        selectionSort(arr); 
        System.out.println(Arrays.toString(arr)); 
    }

    // Function to perform selection sort on the given array
    static void selectionSort(int[] arr) {
        int n = arr.length; 

        // One by one move the boundary of the unsorted subarray
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; // Initialize the minimum element index

            // Find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j; // Update the index of the minimum element
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
