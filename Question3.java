
//Q3: Write a program to calculate the maximum element in the array
import java.util.Scanner;

public class Question3 {

    public static int maxelement(int[] arr, int n) {
        int maxelement = arr[0];
        for (int i = 0; i < n; i++) {
            if (arr[i] >= maxelement) {
                maxelement = arr[i];
            }

        }
        return maxelement;
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
        int result = maxelement(arr, n);
        System.out.println("max of element : " + result);
    }
}
