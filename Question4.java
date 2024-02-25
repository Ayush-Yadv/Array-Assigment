
import java.util.Arrays;
import java.util.Scanner;

public class Question4 {
    public static int secLargest(int[] arr, int n) {
        Arrays.sort(arr);
        return arr[n - 2];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input length of array");
        int n = sc.nextInt();
        System.out.println("input number in array");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int result = secLargest(arr, n);
        System.out.println("max sec element : " + result);
    }
}
