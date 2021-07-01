// Write a Program to accept two integers through the command line argument and print the sum of the two numbers

class solution {
    public static void main(String[] args){
        if (args.length == 2){
            int n1 = Integer.parseInt(args[0]);
            int n2 = Integer.parseInt(args[1]);
            int sum = n1+n2;
            System.out.println("Sum of the two number :"+sum);
        }
        else
        System.out.println("Usage: Java solution exceeds args");
    }
}