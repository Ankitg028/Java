/**
 * Write a program to add all the values in a given number and print. Ex: 1234->10
 */


class solution{
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        for(int i = 0; num>0;i++){
            sum += num%10;
            num /= 10;
        }
        System.out.println("Add of value in a given Number: "+sum);
    }
}