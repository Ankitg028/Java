/*
 * Create an abstract class Compartment to represent a rail coach. Provide an abstract 
 * function notice in this class. Derive FirstClass, Ladies, General, Luggage classes 
 * from the compartment class. Override the notice function in each of them to print notice 
 * suitable to the type of the compartment.
 * Create a class TestCompartment . Write main function to do the following:
 * Declare an array of Compartment of size 10.
 * Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
 * Check the polymorphic behavior of the notice method.
**/

import java.util.Random;

abstract class Compartment{
    abstract void notice();
} 
class FirstClass extends Compartment{
    void notice(){
        System.out.println("This is a First Class");
    }
}
class Ladies extends Compartment{
    void notice(){
        System.out.println("This is a Ladies Compartment");
    }
}
class General extends Compartment{
    void notice(){
        System.out.println("This is a General Class");
    }
}
class Luggage extends Compartment{
    void notice(){
        System.out.println("This is a Luggage Compartment");
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment c[] = new Compartment[10];

        Random rand = new Random();

        for (int i = 0; i < 10; i++) {
            int n = rand.nextInt(4) + 1;
            switch (n) {
                case 1:
                    c[i] = new FirstClass();
                    break;
                case 2:
                    c[i] = new Ladies();
                    break;
                case 3:
                    c[i] = new General();
                    break;
                case 4:
                    c[i] = new Luggage();
                    break;
            
                default:
                    break;
            }
        }
        for (int i = 0; i < 10; i++) {
            c[i].notice();
        }
    }
}