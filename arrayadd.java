public class arrayadd {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {10, 20, 30, 40, 50};
        int[] sum = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            sum[i] = a[i] + b[i];
        }

        System.out.print("Sum of arrays: ");
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }
    }
}
