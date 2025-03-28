import java.util.Scanner;

/**
 * The SecondTask class reads an array from input and calculates its average value.
 */
public class SecondTask {
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

        // Function call and average output
        System.out.println(findAvg(n, arr));
    }

    /**
     A function for calculating the average value of an array.
     *
     * @param n   size of array
     * @param arr array of numbers
     * @return average of numbers
     */
    public static float findAvg(int n, int[] arr) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return (float) sum / n;
    }
}
// The time complexity is O(n), since we have 2 separate "for" loops, each traversing the array 1 time.
