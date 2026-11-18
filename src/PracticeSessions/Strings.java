package PracticeSessions;

import java.util.Scanner;


public class Strings {
   // public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //RUNTIME............


//        String [] names = new String [5];
//        System.out.println("Enter Names: ");
//        for (int i =0 ; i <5; i++){
//            names[i] =sc.nextLine();
//        }
//        System.out.println("Names are: ");
//        for (int i = 0; i < 5; i++) {
//            System.out.println(names[i]);
//        }

        //COMPILE TIME............
//        String [] names = {"sneha", "nano","bhumi"};
//        for (String i : names){
//            System.out.println(i);
//        }


        //REVERSE STRING.....
//        String[] names = new String[3];
//        System.out.println("Enter 3 names:");
//        for (int i = 0; i < 3; i++) {
//            names[i] = sc.nextLine();
//        }
//        System.out.println("Reversed names:");
//        for (int i = 0; i < 3; i++) {
//            char[] letters = names[i].toCharArray();
//            for (int j = letters.length - 1; j >= 0; j--) {
//                System.out.print(letters[j]);
//            }
//            System.out.println();
//        }


        //STRING PALINDROME....
        //TWO POINTER APPROACH.......
//        public static String isPalindrome(String s) {
//            int left = 0, right = s.length() - 1;
//
//            while (left < right) {
//                if (s.charAt(left) != s.charAt(right)) {
//                    return "String not palindrome";
//                }
//                left++;
//                right--;
//            }
//            return "String Palindrome";
//        }
//
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter String");
//            String s = sc.nextLine();
//            System.out.println(isPalindrome(s));// true
//
//        }


    //USING WHILE LOOP................
    public static String isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return "String is not Palindrome...";
            }

            left++;
            right--;
        }

        return "String is Palindrome...";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));
    }
}


