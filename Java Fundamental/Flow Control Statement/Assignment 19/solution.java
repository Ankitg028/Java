/**
* Write a program to print first 5 values which are divisible by 2, 3, and 5.
*/

class solution{
    public static void main(String[] args) {
        int n = 0;
        for(int i = 0;i<100;i++){
            if(n%2 == 0 && n%3 == 0 && n%5 == 0) {
                System.out.print(n+ " ");
            }
            n++;
        }
        System.out.println();
    }
}