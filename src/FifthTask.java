import java.util.Scanner;

public class FifthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(n + "-th Fibonacci is: " + fibonacci(n));
    }

    /**
     * Recursively calculates the n-th Fibonacci number.
     * Time Complexity: O(2^n) - Exponential due to repeated calculations.
     * Space Complexity: O(n) - Due to recursive call stack.
     *
     * @param n The position in Fibonacci sequence.
     * @return The n-th Fibonacci number.
     */
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Base case: F(0) = 0
        } else if (n == 1) {
            return 1; // Base case: F(1) = 1
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Recursive calls
    }
}
