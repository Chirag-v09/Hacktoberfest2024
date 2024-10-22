import java.util.Scanner;

public class ShellSort {
    // Function to perform shell sort
    public static void shellSort(int[] arr) {
        int n = arr.length;
        
        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Perform gapped insertion sort for this gap size
            for (int i = gap; i < n; i++) {
                int temp = arr[i];
                int j;
                // Shift elements to the right until the correct position for arr[i] is found
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) {
                    arr[j] = arr[j - gap];
                }
                arr[j] = temp;
            }
        }
    }

    // Function to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Original array:");
        printArray(arr);

        // Performing shell sort
        shellSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);

        sc.close();
    }
}
