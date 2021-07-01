/**
 * Write a program to check if a given number is Positive, Negative, or Zero.
 */

import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number to be Checked: ");
        int n = in.nextInt();

        if(n == 0){
            System.out.println(n+" is a Zero");
       }
       else if(n > 0){
            System.out.println(n+" is a Positive Number");
       }
       else{
        System.out.println(n+" is a Negative Number");
       }
    }
}