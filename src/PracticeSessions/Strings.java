package PracticeSessions;

import java.util.Arrays;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
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
        String[] names = new String[3];
        System.out.println("Enter 3 names:");
        for (int i = 0; i < 3; i++) {
            names[i] = sc.nextLine();
        }
        System.out.println("Reversed names:");
        for (int i = 0; i < 3; i++) {
            char[] letters = names[i].toCharArray();
            for (int j = letters.length - 1; j >= 0; j--) {
                System.out.print(letters[j]);
            }
            System.out.println();
        }
    }
}
