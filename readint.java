import java.util.Scanner;

public class readint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user
        System.out.print("Enter an integer: ");
        
        // Read the integer
        int number = scanner.nextInt();
        
        // Print the integer
        System.out.println("You entered: " + number);

        scanner.close();
    }
}
