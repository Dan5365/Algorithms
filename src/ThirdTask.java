import java.util.Scanner;

/**
 * A program to check whether a given number is prime.
 * Uses an optimized algorithm that checks divisibility only up to √n.
 **/

/**
 * non optimized 'O(n)' but working algorithm is
 * for (i = 2; i <= n; i++) {
 * if (n % i === 0 && n != i) {
 * return false;
 * }
 **/
public class ThirdTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        // Call the function to check if the number is prime
        System.out.println(isPrime(n));
    }

    /**
     * Determines whether a number is prime.
     * Time Complexity: O(√n) since we check divisibility only up to √n.
     * @param n The number to check.
     * @return true if the number is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        } else {
            for (int i = 2; i * i <= n; i++) { // Check divisibility only up to √n
                if (n % i == 0) {
                    return false; // Found a divisor → n is composite
                }
            }
            return true; // No divisors found → n is prime
        }
    }
}







