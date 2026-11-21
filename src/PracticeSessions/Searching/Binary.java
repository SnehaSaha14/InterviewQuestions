package PracticeSessions.Searching;

import java.util.Scanner;

public class Binary {
    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            // Calculate the middle index safely
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                // Search in the right half
                left = mid + 1;
            } else {
                // Search in the left half
                right = mid - 1;
            }
        }

        // Target is not present
        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70};

        int target = 50;

        int result = binarySearch(arr, target);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println(
                    "Element found at index: " + result);
        }
    }
}

