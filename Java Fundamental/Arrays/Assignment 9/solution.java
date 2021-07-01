/**
 * Write a program to print the sum of the elements of the array with the given below condition.
 * If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and the numbers between them for
 * the calculation of sum.
 * Eg1) Array Elements - 10,3,6,1,2,7,9
 * O/P: 22   
 * [i.e 10+3+9]
 */

import java.util.*;

class solution {
    public static void main(String[] args) {
        int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            n = sc.nextInt();
            int arr[] = new int[n];
            System.out.println("Enter the Element of array:");
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();           
            }
            int num1 = 6;
            int num2 = 7;
            int sum = 0;
            boolean flag = false;
            for(int i : arr)
            {
                if(i == num1)
                {
                    flag = true;
                }
                if(flag == true)
                {
                    if(i == num2)
                    {
                        flag = false;
                    }
                    continue;
                }
                else
                {
                        sum += i;
                }
            }
            System.out.println("sum is "+sum);
    }
}