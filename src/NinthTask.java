import java.util.Scanner;

public class NinthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        scanner.close();

        System.out.println(binomialCoefficient(n, k));
    }

    /**
     * Recursively calculates the binomial coefficient C(n, k).
     * Uses the formula: C(n, k) = C(n-1, k-1) + C(n-1, k)
     * Base cases: C(n, 0) = C(n, n) = 1
     *
     * Time Complexity: O(2^n) - Exponential complexity due to recursion.
     * Space Complexity: O(n) - Due to recursive call stack.
     *
     * @param n Total number of elements.
     * @param k Number of chosen elements.
     * @return Binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // Base cases
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
