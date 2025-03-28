import java.util.Scanner;

public class SixthTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();

        System.out.println(power(a, n));
    }

    /**
     * Recursively calculates a^n (a raised to the power of n).
     * Time Complexity: O(n) - Calls itself n times.
     * Space Complexity: O(n) - Due to recursive call stack.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of a^n.
     */
    public static int power(int a, int n) {
        if (n == 0) {
            return 1; // Any number raised to 0 is 1
        }
        return a * power(a, n - 1); // Recursive call
    }

}
