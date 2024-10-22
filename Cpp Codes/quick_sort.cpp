#include <iostream>
using namespace std;

// Function to perform QuickSort
void quickSort(int arr[], int low, int high) {
    if (low < high) {
        // Partitioning index
        int pi = partition(arr, low, high);

        // Recursively sort elements before and after partition
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

// Partition function to place pivot at correct position
int partition(int arr[], int low, int high) {
    int pivot = arr[high]; // Pivot element (last element)
    int i = (low - 1);     // Index of smaller element

    for (int j = low; j < high; j++) {
        if (arr[j] <= pivot) { // If current element is smaller than the pivot
            i++;
            // Swap arr[i] and arr[j]
            swap(arr[i], arr[j]);
        }
    }
    // Swap arr[i + 1] and pivot (arr[high])
    swap(arr[i + 1], arr[high]);
    return (i + 1); // Return partitioning index
}

// Function to print the array
void printArray(int arr[], int size) {
    for (int i = 0; i < size; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int main() {
    int n;

    // Taking input from the user for array size
    cout << "Enter the number of elements in the array: ";
    cin >> n;

    // Declaring array and taking elements from the user
    int arr[n];
    cout << "Enter the elements of the array: ";
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << "Original array: ";
    printArray(arr, n);

    // Sorting the array using QuickSort
    quickSort(arr, 0, n - 1);

    cout << "Sorted array: ";
    printArray(arr, n);

    return 0;
}
