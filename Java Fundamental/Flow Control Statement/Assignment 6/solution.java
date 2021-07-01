/**
 * Write a program to accept gender ("Male" or "Female") and age (1-120) 
 * from command line arguments and print the percentage of interest based on the given conditions.
 * Interest == 8.2% 
 * Gender ==> Female
 * Age    ==>1 to 58
 * Interest == 7.6% 
 * Gender ==> Female
 * Age    ==>59 -120
 * Interest == 9.2% 
 * Gender ==> Male
 * Age    ==>1-60
 * Interest == 8.3% 
 * Gender ==> Male
 * Age    ==>61-120
 */
import java.util.*;

class solution{
    public static void main(String[] args) {
        if(args.length == 2){
            String gender = args[0];
            int age = Integer.parseInt(args[1]);

            if(gender.equals("male") || gender.equals("Male")){
                if(age >= 1 && age <= 60){
                    System.out.println("Percentage of interest: 9.2% \nFor Gender: "+gender+"\nAge: "+age);
                }
                else if(age >= 61 && age <= 120){
                    System.out.println("Percentage of interest: 8.3% \nFor Gender: "+gender+"\nAge: "+age);
                }
                else{
                    System.out.println("You Are Too Young or Too Old to exits");
                }
            }
            else if(gender.equals("female") || gender.equals("Female")){
                if(age >= 1 && age <= 58){
                    System.out.println("Percentage of interest: 8.2% \nFor Gender: "+gender+"\nAge: "+age);
                }
                else if(age >= 59 && age <= 120){
                    System.out.println("Percentage of interest: 7.6% \nFor Gender: "+gender+"\nAge: "+age);
                }
                else{
                    System.out.println("You Are Too Young or Too Old to exits");
                }
            }
        }
        else{
            System.out.print("Try Again !!\nTry This \nGender (Male or Female) and Age (1-120) ");
        }
    }
}