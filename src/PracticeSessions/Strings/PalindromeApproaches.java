package PracticeSessions.Strings;

import java.util.Scanner;

public class PalindromeApproaches {

    //USING TWO POINTER.........
//    public static String isPalindrome(String s) {
//        int left = 0, right = s.length() - 1;
//
//        while (left < right) {
//            if (s.charAt(left) != s.charAt(right)) {
//                return "String is not Palindrome";
//            }
//            left++;
//            right--;
//        }
//        return "String is palindrome";
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println(isPalindrome("Enter String"));
//        String s = sc.nextLine();
//        System.out.println(isPalindrome(s));// true
//
//    }
//}

    public static String isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return "String is not Palindrome";
            }

            left++;
            right--;
        }

        return "String Palindrome";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.println(isPalindrome(s));

    }
}
