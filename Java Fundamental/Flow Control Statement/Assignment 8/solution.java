/**
 *  Write a program to print the color name, based on color code. If color code in not valid
 *  then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.
 */

import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        System.out.print("Enter the Color Code: ");
        char code = in.nextLine().charAt(0);

        switch (code) {
            case 'R':
                System.out.print("Red Color");
                break;
            case 'B':
                System.out.print("Blue Color");
                break;
            case 'G':
                System.out.print("Green Color");
                break;
            case 'O':
                System.out.print("Orange Color");
                break;
            case 'Y':
                System.out.print("Yellow Color");
                break;
            case 'W':
                System.out.print("White Color");
                break;
            default:
                System.out.print("Invalid Color");
                break;
        }
    }
}