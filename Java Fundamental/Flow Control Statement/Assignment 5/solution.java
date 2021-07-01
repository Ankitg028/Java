/**
 *  Intialize a character variable in a program and if the value is alphabet then print "Alphabet"
 *  if it’s a number then print "Digit" and for other characters print "Special Character"
 */
import java.util.*;

class solution{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch = in.nextLine().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch+" is a Alphabet");
        }
        else if (ch >= '0' && ch <= '9'){
            System.out.println(ch+" is a Digit");
        }
        else
        {
            System.out.println(ch+" is a Special Character");
        }

    }
}