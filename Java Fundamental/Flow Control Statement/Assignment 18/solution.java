/**
 *  Write a Java program to find if the given number is palindrome or not
 */

class solution{
    public static void main(String[] args) {
        if(args.length > 0) {
            int n = Integer.parseInt(args[0]);
            if(n==palin(n)){
                System.out.println(n+" is a Palindrome");
            }
            else{
                System.out.println(n+" is not a Palindrome");
            }
        }
        else{
            System.out.print("Try Again!!");
        }
    }
    public static int palin(int n) {
        int rev = 0;
        while(n > 0){
            rev = rev*10+(n%10);
            n /= 10;
        }
        return rev;
    }
}