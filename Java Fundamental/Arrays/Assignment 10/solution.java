/**
 *  Write a program to reverse the elements of a given 2*2 array.
 *  Four integer numbers needs to be passed as Command Line arguments.
 */

class solution{
    public static void main(String[] args) {
        if(args.length != 4)
            System.out.println("Enter 4 Number!!");
        else
        {
            int arr[][] = new int[2][2];
            for (int i = 0,k=0; i < 2; i++) {
                for(int j=0;j<2;j++,k++){
                    arr[i][j] = Integer.parseInt(args[k]);
                }
            }

            System.out.println("The Given Array is : ");

            for(int i = 0;i<2;i++){
                for(int j=0;j<2;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

            //reversing row
            for(int i = 0;i<2;i++){
                int temp = arr[0][i];
                arr[0][i] = arr[1][i];
                arr[1][i] = temp;
            }
            
            //reversing column
            for(int i = 0;i<2;i++){
                int temp = arr[i][0];
                arr[i][0] = arr[i][1];
                arr[i][1] = temp;
            }
            
            //printing reverse array
            System.out.println("The reverse of the array is :");
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}