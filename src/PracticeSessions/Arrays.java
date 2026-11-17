package PracticeSessions;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);

        //PRINTING SUM OF ARRAY.........

//        int arr[] = new int[4];
//        int sum = 0;
//
//        System.out.print("Enter the numbers: ");
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//            sum += arr[i];
//        }
//
//        System.out.println("Sum of the array is: " + sum);
//        }


        // ARRAYLIST: STORE, SORT, ROTATE.......

//        List<Integer> nums = new ArrayList<>();
//        int arr[] = new int[3];
//        System.out.println("Enter elements: ");
//        for (int i =0; i <arr.length; i++){
//            arr[i]=sc.nextInt();
//            nums.add(arr[i]);
//
//        }
//        System.out.println(nums);

//        Collections.sort(nums);
//        System.out.println(nums);

//        Collections.rotate(nums, 2); // Rotating element From Right Side.........
//        System.out.println("Right Rotated List: "+nums);


        //REVERSEING AN ARRAY

//         String [] names = new String [3];
//         Scanner sc = new Scanner ( System.in);
//
//         System.out.print("Enter Names: ");
//         for ( int i =names.length-1;i>=0;i--){
//             names[i]= sc.nextLine();
//
//         }
//         java.util.Arrays.sort(names);
//         System.out.println("Reveresed names are: ");
//         for (String i : names) {
//             System.out.println(i);
//         }


        //SEARCHING AN ELEMENT.....
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched: ");
        int search = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 5; i++) {
            if (nums[i] == search) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Element is in the array");
        } else {
            System.out.println("element not found");
        }

    }
}
