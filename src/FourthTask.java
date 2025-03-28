import java.util.Scanner;

public class FourthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factorial(n));
    }

    /**
     * Recursively calculates the factorial of a number.
     * Time Complexity: O(n) - Calls itself n times.
     * Space Complexity: O(n) - Due to recursive call stack.
     *
     * @param n The number to calculate factorial for.
     * @return The factorial of n.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; //0! and 1! are both 1
        }
        return n * factorial(n - 1); // Recursive call
    }
}

