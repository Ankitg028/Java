/*
 * Create an abstract class Instrument which is having the abstract function play. 
 * Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
 * Override the play method inside all three classes printing a message 
 * Piano is playing  tan tan tan tan for Piano class
 * Flute is playing  toot toot toot toot  for Flute class
 * Guitar is playing  tin  tin  tin  for Guitar class 
 * You must not allow the user to declare an object of Instrument class.
 * Create an array of 10 Instruments.
 * Assign different type of instrument to Instrument reference.
 * Check for the polymorphic behavior of  play method.
 * Use the instanceof operator to print that which object stored at which index of instrument array.
* */

import java.util.Random;
abstract class Instrument{
    abstract void tune();
}

class Piano extends Instrument{
    void tune(){
        System.out.println("Piano is playing  tan tan tan tan");
    }
}
class Flute extends Instrument{
    void tune(){
        System.out.println("Flute is playing  toot toot toot toot");
    }
}
class Guitar extends Instrument{
    void tune(){
        System.out.println("Guitar is playing  tin  tin  tin");
    }
}
class main {
    public static void main(String[] args) {
            Instrument instruments[] = new Instrument[10];  
            Random rand = new Random();
            
            for (int i = 0; i < 10; i++) 
            {
                int n = rand.nextInt(3)+1;
                switch (n) 
                {
                    case 1:
                        instruments[i] = new Piano();
                        break;
                    case 2:
                        instruments[i] = new Flute();
                        break;
                    case 3:
                        instruments[i] = new Guitar();
                        break;
                }
            }
            for (int i = 0; i < 10; i++) {
                if(instruments[i] instanceof Piano)
                    System.out.print("Instrument " + i + " is of type Piano, ");
                if(instruments[i] instanceof Flute)
                    System.out.print("Instrument " + i + " is of type Flute, ");
                if(instruments[i] instanceof Guitar)
                    System.out.print("Instrument "+ i + " is of type Guitar, ");
                instruments[i].tune();
            }
    }
}