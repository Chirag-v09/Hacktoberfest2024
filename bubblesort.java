public class bubblesort {

    // Method to perform the bubble sort algorithm
    public static void sort(int[] array) {
        int length = array.length;

        // Loop through the array multiple times
        for (int pass = 0; pass < length - 1; pass++) {
            boolean isSorted = true;

            // Compare adjacent elements and swap if needed
            for (int i = 0; i < length - pass - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Swap the two elements
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    // Mark that a swap occurred
                    isSorted = false;
                }
            }

            // If no swaps were made, the array is already sorted
            if (isSorted) {
                break;
            }
        }
    }

    // Main method to test the bubble sort
    public static void main(String[] args) {
        int[] numbers = {45, 32, 18, 27, 10, 90};

        System.out.println("Array before sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }

        sort(numbers); // Call the sort method

        System.out.println("\nArray after sorting:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
