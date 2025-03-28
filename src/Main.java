import java.util.Scanner;

/**
 * Класс Main выполняет ввод массива и поиск минимального числа.
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
     * Функция для поиска минимального элемента в массиве.
     * @param n   размер массива
     * @param arr массив чисел
     * @return минимальный элемент массива
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
