/**
 * Write a program that displays a menu with options 
 * 1. Add 
 * 2. Sub
 * Based on the options chosen, read 2 numbers and perform the relevant operation. 
 * After performing the operation, the program should ask the user if he wants to continue.
 * If the user presses y or Y, then the program should continue displaying the menu else 
 * the program should terminate.
 * [ Note: Use Scanner class, you can take help from the trainer regarding the same ]
 */
import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char choice = 'y';
        do
        {
            int a = 0 , b = 0, ch = 0;
            System.out.print("Enter choice:\n1. Add\n2. Sub\n");
            ch = Integer.parseInt(in.nextLine());

            switch (ch) 
            {
                case 1:
                    System.out.println("Enter First Digit: ");
                    a = Integer.parseInt(in.nextLine().trim());
                    System.out.println("Enter Second Digit: ");
                    b = Integer.parseInt(in.nextLine().trim());
                    System.out.println("Addition: "+(a+b));
                    break;
                case 2:
                    System.out.println("Enter First Digit: ");
                    a = Integer.parseInt(in.nextLine().trim());
                    System.out.println("Enter Second Digit: ");
                    b = Integer.parseInt(in.nextLine().trim());
                    System.out.println("Subtraction: "+(a-b));
                    break;
                default:
                    System.out.println("Invalid Choice!");
                    break;
            }
            System.out.print("Want to try again? (y/n): ");
            choice = in.nextLine().trim().charAt(0);
        }while(choice == 'y' || choice == 'Y');
    }
}