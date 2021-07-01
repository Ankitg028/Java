/**
 * Write a program to check if a given number is prime or not
 */
import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        if(isPrime(num)){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not a Prime Number");
        }
    }
    static boolean isPrime(int n) {
        if(n == 0 || n == 1) return false;

        int l = (int)Math.sqrt(n);
        for(int i=2;i<=l;i++){
            if(n%i==0)
                return false;
        }
    return true;
    }
}