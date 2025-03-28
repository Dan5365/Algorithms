import java.util.Scanner;

public class SeventhTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // We read the number of elements
        printReverse(n, scanner); // Running the recursive function
    }

    /**
     * Recursively reads and prints numbers in reverse order.
     * Time Complexity: O(n) - Reads and prints n elements.
     * Space Complexity: O(n) - Due to recursive call stack.
     *
     * @param count The number of elements to read.
     * @param scanner Scanner object to read input.
     */
    public static void printReverse(int count, Scanner scanner) {
        if (count == 0) {
            return;
        }
        int num = scanner.nextInt(); // Reading the number
        printReverse(count - 1, scanner); // Recursive call before printing
        System.out.print(num + " "); // Output a number after returning from recursion
    }
}
