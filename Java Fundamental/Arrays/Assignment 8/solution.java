/**
 *  Write a program to print the element of an array that has occurred the highest number of times
 */

class solution{
    public static void main(String[] args) {
        int arr[] = { 10, 20, 10, 30, 40, 100, 99 };
        int max = 0, id = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            int c = 0;
            for (int j = 0; j < arr.length; j++) 
            {
                if(arr[i] == arr[j])
                    c++;
            }
            if(max < c) 
            {
                max = c;
                id = i;
            }
        }
        System.out.println("Highest Number of Times: "+max);
        System.out.println(arr[id]);
    }
}