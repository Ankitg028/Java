/**
 * Write a program to find greatest number in a 3*3 array. 
 * The program is supposed to receive 9 integer numbers as command line arguments.
 */

class solution{
    public static void main(String[] args) {
        if(args.length != 9)
            System.out.println("Enter 9 Number!!");
        else
        {
            int arr[][] = new int[3][3];
            for (int i = 0,k=0; i < 3; i++) {
                for(int j=0;j<3;j++,k++){
                    arr[i][j] = Integer.parseInt(args[k]);
                }
            }

            System.out.println("The Given Array is : ");

            for(int i = 0;i<3;i++){
                for(int j=0;j<3;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            int max =0;
            for(int i = 0;i<3;i++){
                for(int j=0;j<3;j++){
                    if(max < arr[i][j]){
                        max = arr[i][j];
                    }
                }
            }
            System.out.println("Greatest Number in 3*3 Array: "+max);
        
        }   
    }
}