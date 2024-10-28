package LeetcodeJavaCodes;

import java.util.Arrays;

/*You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer. The digits are ordered
from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.
Increment the large integer by one and return the resulting array of digits.

-> Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].*/

public class Plus_one {
    public static void main(String[] args) {
        int arr[] = {9, 1, 5, 9}; // or {9, 9, 9};
        int size = arr.length;

        // Convert the array to a number
        int number = 0;
        for (int i = 0; i < size; i++) {
            number = number * 10 + arr[i];
        }

        // Add 1 to the number
        number += 1;

        // Convert the number back to an array
        int num[] = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            num[i] = number % 10;
            number /= 10;
        }

        System.out.println(Arrays.toString(num));
    }
}

