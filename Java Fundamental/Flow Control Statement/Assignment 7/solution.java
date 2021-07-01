/**
 *  Write a program to convert from upper case to lower case and vice versa of an alphabet
 *  and print the old character and new character as shown in example (Ex: a->A, M->m).
 */

import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = in.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Old Character: "+ch+"\nNew Character: "+Character.toLowerCase(ch));
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("Old Character: "+ch+"\nNew Character: "+Character.toUpperCase(ch));
        }
    }
}