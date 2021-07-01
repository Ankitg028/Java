/**
 *  Write a program to initialize an integer array and find the maximum and minimum value of an array
 */

 import java.util.*;

 class solution{
     public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        
        int max = 0 , min = 0;

        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
            if(min > arr[i])
                min = arr[i];
        }
            System.out.println("Max: "+max+"\nMin: "+min);
     }
 }

