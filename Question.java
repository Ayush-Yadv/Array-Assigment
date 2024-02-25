
//Q1: Write a program to print the sum of all the elements present on even indices in the given array.
import java.util.Scanner;

class Question {
    public static int sum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
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
        int result = sum(arr, n);
        System.out.println("Sum of elements at even indices: " + result);
    }
}