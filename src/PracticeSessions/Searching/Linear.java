package PracticeSessions.Searching;

import java.util.Scanner;

public class Linear {
    //    public static int linearSearch(int[] array, int key) {
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == key) {
//                return i; // Key found, return index
//            }
//        }
//        return -1; // Key not found
//    }
//    public static void main(String[] args) {
//        int[] numbers = {5, 8, 12, 15, 20};
//        int key =0;
//        int result = linearSearch(numbers, key);
//        if (result != -1) {
//            System.out.println("Element found at index: " + result);
//        } else {
//            System.out.println("Element not found.");
//        }
//
//    }
    public static int linearSearch(int[] n, int key) {

        for (int i = 0; i < n.length; i++) {

            if (n[i] == key) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] n = new int[size];

        System.out.println("Enter elements:");

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = linearSearch(n, key);
        if ( result == -1){
            System.out.println("element not found" );
        } else{
            System.out.println("element found");
        }
    }
}

