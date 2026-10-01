import java.util.Scanner;

class arraypositive {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n= sc.nextInt();

        int[] arr = new int[n];

        int positiveCount= 0;
        int negativeCount=0;

        System.out.println("Enter array elements:");

        for (int i= 0; i< n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Positive numbers: ");
        for (int i= 0; i < n; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
                positiveCount++;
            }
        }   

        System.out.print("\nNegative numbers: ");
        for (int i= 0; i < n; i++) {
            if (arr[i]< 0) {
                System.out.print(arr[i] + " ");
                negativeCount++;
            }
        }

        System.out.println("\nNumber of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
    }
}