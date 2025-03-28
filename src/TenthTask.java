import java.util.Scanner;

public class TenthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        System.out.println(gcd(a, b));
    }

    /**
     * Recursively calculates the Greatest Common Divisor (GCD) using Euclidean Algorithm.
     * Uses the formula: GCD(a, b) = GCD(b, a % b)
     * Base case: GCD(a, 0) = a
     *
     * Time Complexity: O(log(min(a, b))) - Logarithmic complexity.
     * Space Complexity: O(log(min(a, b))) - Due to recursive call stack.
     *
     * @param a First number.
     * @param b Second number.
     * @return GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a; // Base case: if second number is 0, return the first number
        }
        return gcd(b, a % b); // Recursive step
    }
}
