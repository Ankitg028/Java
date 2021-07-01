/**
 * Write a program to check if a given number is odd or even.
 */

import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int Num = in.nextInt();
        if(Num % 2==0){
            System.out.println(Num+" is a Even Number");
        }
        else
        System.out.println(Num+" is a Odd Number");
    }
}