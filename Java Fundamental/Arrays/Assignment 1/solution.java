/**
 *  Write a program to initialize an integer array and print the sum and average of the array
 */

class solution{
    public static void main(String[] args) {
        int arr[] = {2, 4 , 6 , 8, 10};
        double sum = 0, avg =0;

        for (int i = 0 ;i < arr.length ;i++) {
            sum += arr[i];
        }

        avg = sum/arr.length;

        System.out.println("Sum of the Array: "+sum+"\nAverage of the Array: "+avg);
    }
}