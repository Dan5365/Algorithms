import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
        scanner.close();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
// Временная сложность O(n), так как у нас 2 отдельных цикла for, каждый проходит массив 1 раз.
