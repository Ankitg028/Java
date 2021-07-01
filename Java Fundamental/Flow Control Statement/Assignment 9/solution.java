/**
 * Write a program to print month in words, based on input month in numbers
 */

 import java.util.Scanner;

 class solution{
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Input Month in number: ");
        int n = in.nextInt();

        switch (n) {
            case 1:
                System.out.print("Jan");
                break;
            case 2:
                System.out.print("Feb");
                break;
            case 3:
                System.out.print("Mar");
                break;
            case 4:
                System.out.print("Apr");
                break;
            case 5:
                System.out.print("May");
                break;
            case 6:
                System.out.print("Jun");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default: System.out.println("Invalid number");
        }

     }
 }