import java.util.Scanner;

public class ArmstrongNumber {

    // Function to check if a number is an Armstrong number
    static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0;
        int n = 0;

        originalNum = num;

        // Find the number of digits in the number
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        // Calculate the sum of nth power of each digit
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        // Check if the sum is equal to the original number
        return result == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        sc.close(); // Close the scanner
    }
}
