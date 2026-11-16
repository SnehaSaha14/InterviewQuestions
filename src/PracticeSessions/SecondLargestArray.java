package PracticeSessions;

import java.util.*;

public class SecondLargestArray {
    public static void main (String [] args) {
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

         String [] names = new String [3];
         Scanner sc = new Scanner ( System.in);

         System.out.print("Enter Names: ");
         for ( int i =names.length-1;i>=0;i--){
             names[i]= sc.nextLine();

         }
         Arrays.sort(names);
         System.out.println("Reveresed names are: ");
         for (String i : names) {
             System.out.println(i);
         }
    }
}
