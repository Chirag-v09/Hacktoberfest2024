#include <bits/stdc++.h>
using namespace std;

// Function to find the LIS ending at index 'i' and to check with previous index 'prev'
int lisUtil(vector<int> &arr, int i, int prev, vector<vector<int>> &dp) {
    // Base case: End of array
    if (i == arr.size()) 
        return 0;
    
    // Check if result is already computed
    if (dp[i][prev + 1] != -1) 
        return dp[i][prev + 1];
    
    // Case 1: Exclude the current element and move to the next element
    int exclude = lisUtil(arr, i + 1, prev, dp);
    
    // Case 2: Include current element if it is greater than the previous included element
    int include = 0;
    if (prev == -1 || arr[i] > arr[prev]) 
        include = 1 + lisUtil(arr, i + 1, i, dp);
    
    // Store the result in dp table and return the maximum of include and exclude cases
    return dp[i][prev + 1] = max(include, exclude);
}

// Function to find length of the LIS in the array
int lis(vector<int> &arr) {
    int n = arr.size();
    // Initialize dp array with -1
    vector<vector<int>> dp(n, vector<int>(n + 1, -1));
    return lisUtil(arr, 0, -1, dp);
}

int main() {
    vector<int> arr = {10, 22, 9, 33, 21, 50, 41, 60};
    cout << "Length of LIS is " << lis(arr) << endl;
    return 0;
}
