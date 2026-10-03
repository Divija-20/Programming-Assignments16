import java.util.Scanner;

public class arraysum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in the array: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int sum = 0;
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.println("Sum of array elements: " + sum);

        scanner.close();
    }
}
