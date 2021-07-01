/**
 * Write a Java program to find if the given number is prime or not.
 */

class solution{
    public static void main(String[] args) {
        if(args.length == 0 ){
            System.out.println("Please enter the number!!");
        }
        
            int num = Integer.parseInt(args[0]);
            if(num == 0 || num == 1){
                System.out.println(num+" is neither a prime or composite number");
            }
            else{
                if(isPrime(num)){
                    System.out.println(num+" is a Prime Number");
                }
                else{
                    System.out.println(num+" is not a Prime Number");
                }
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