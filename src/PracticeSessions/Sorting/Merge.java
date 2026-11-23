package PracticeSessions.Sorting;

import java.util.Scanner;

public class Merge {
    static void merge(int[] arr, int low, int mid, int high) {

        int i = low;
        int j = mid + 1;
        int k = 0;

        int[] temp = new int[high - low + 1];

        // Compare elements and store in sorted order
        while (i <= mid && j <= high) {

            if (arr[i] < arr[j]) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }

            k++;
        }

        // Copy remaining elements from left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // Copy remaining elements from right part
        while (j <= high) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        // Copy temp back to original array
        for (i = low, k = 0; i <= high; i++, k++) {
            arr[i] = temp[k];
        }
    }

    // Merge Sort
    static void mergeSort(int[] arr, int low, int high) {

        if (low < high) {

            int mid = (low + high) / 2;

            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);

            merge(arr, low, mid, high);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
