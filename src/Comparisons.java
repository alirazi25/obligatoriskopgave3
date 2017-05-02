/*
 * Chapter 7: Lab exercises
 * Interfaces - Using the Comparable Interface
 */

import java.util.Scanner;

/**
 *
 * @author andrasacs
 */
public class Comparisons {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String s1, s2, s3;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter string 1:");
        s1 = input.nextLine();
        System.out.println("Enter string 2:");
        s2 = input.nextLine();
        System.out.println("Enter string 3:");
        s3 = input.nextLine();
        System.out.println(Compare3.largest(s1, s2, s3));
        
    }
    
}
