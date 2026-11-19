package PracticeSessions.Strings;

import java.util.Scanner;

public class Reverse {

    public static String reverseString(String s) {

        String reverse = "";
        int i = s.length() - 1;

        while (i >= 0) {
            reverse = reverse + s.charAt(i);
            i--;
        }

        return reverse;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.println("Reversed String: " + reverseString(s));
    }
}