/*
Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly(). 
Create an instance of Animal class and invoke the eat and sleep methods using this object.
Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.

**/
public class Bird extends Animal {
    public void eat() {
        System.out.println("Bird is Eating!!");
    }

    public void sleep() {
        System.out.println("Bird is Sleeping zzz...zzz...!!!");
    }

    public void fly() {
        System.out.println("Bird is Flying...!!!");
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.eat();
        a1.sleep();

        Bird b1 = new Bird();
        b1.eat();
        b1.sleep();
        b1.fly();
    }
}

class Animal{
    public void eat(){
        System.out.println("Animal is eating.....");
    }

    public void sleep() {
        System.out.println("Animal is sleeping zzz...zzz....!!!");
    }
}

