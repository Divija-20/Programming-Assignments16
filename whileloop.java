import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Initialize the counter variable
        int i = 1;

        // Loop from 1 to N
        while (i <= N) {
            System.out.print(i + " ");
            i++; // Increment the counter
        }

        scanner.close();
    }
}
