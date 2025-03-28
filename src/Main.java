import java.util.Scanner;

/**
 * The Main class enters an array and searches for the minimum number.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        // Filling the array
        int arr[] = new int[n];
        // Entering array elements
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        // Function call and minimum output
        System.out.println(findMin(n, arr));
    }

    /**
     * A function for searching for the minimum element in an array.
     * @param n   size of array
     * @param arr array of numbers
     * @return min element of array
     */
    public static int findMin(int n, int[] arr) {
        int min = arr[0]; // We take the first element as the initial minimum
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
// The time complexity is O(n), since we have 2 separate "for" loops, each traversing the array 1 time.
