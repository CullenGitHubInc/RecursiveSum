import java.util.Scanner;

public class RecursiveSum {

    // Recursive method to calculate the sum of numbers
    public static int sum(int[] numbers, int n) {
        // Base case: if n is 0, return 0
        if (n == 0) {
            return 0;
        }
        // Recursive case: sum the last number and recurse
        return numbers[n - 1] + sum(numbers, n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store 5 numbers

        System.out.println("Enter 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt(); // Store user input in the array
        }

        // Calculate the sum using recursion
        int result = sum(numbers, 5);

        // Output the result
        System.out.println("The sum of the numbers is: " + result);
    }
}
