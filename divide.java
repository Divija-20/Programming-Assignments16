import java.util.Scanner;

public class divide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Roll Number: 2620030396
        System.out.print("Enter the numerator: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the denominator: ");
        double num2 = scanner.nextDouble();

        if (num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            double result = num1 / num2;
            System.out.println("Result: " + num1 + " / " + num2 + " = " + result);
        }

        scanner.close();
    }
}