/**
 *  Write a program to reverse a given number and print
 */

class solution{
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int rev = 0 , temp = n ;
        System.out.println("Given Number: "+n);
        
        while(temp > 0){
            rev = rev *10+(temp%10);
            temp = temp/10;
        }
        System.out.println("Reverse Number: "+rev);
    }
}