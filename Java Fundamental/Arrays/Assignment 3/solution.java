/**
 *  Write a program to initialize an integer array with values and check if a given number
 *  is present in the array or not. If the number is not found, it will print -1 else it will
 *  print the index value of the given  number in the array
 */
import java.util.*;

class solution {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Element in the Array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        
        System.out.println("Enter the Search Value:");

        int n = in.nextInt();
        int id = -1;
        for (int i = 0; i < arr.length; i++) {
            if(n == arr[i])
            {
                 id = i;
            }
        }
        System.out.print("Index value of given Number: "+id);
    }
}